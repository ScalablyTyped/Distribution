package typings.ngShowdown

import typings.angular.mod.IServiceProvider
import typings.ngShowdown.ngShowdownStrings.stripHtml
import typings.showdown.mod.ShowdownOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait SDObject extends StObject {
    
    /**
      * Gets the value of the configuration parameter of CONVERTER specified by key
      * @param key The config parameter key
      */
    def getOption(key: String): Any
    /**
      * Gets the value of the configuration parameter of CONVERTER specified by key
      * @param key The config parameter key
      */
    @JSName("getOption")
    var getOption_Original: js.Function1[/* key */ String, Any]
    
    /**
      * Gets the converter configuration params
      */
    def getOptions(): ShowdownOptions
    /**
      * Gets the converter configuration params
      */
    @JSName("getOptions")
    var getOptions_Original: js.Function0[ShowdownOptions]
    
    /**
      * Converts a markdown text into HTML
      *
      * @param markdown The markdown string to be converted to HTML
      * @returns The converted HTML
      */
    def makeHtml(text: String): String
    /**
      * Converts a markdown text into HTML
      *
      * @param markdown The markdown string to be converted to HTML
      * @returns The converted HTML
      */
    @JSName("makeHtml")
    var makeHtml_Original: js.Function1[/* text */ String, String]
    
    /**
      * Strips a text of it's HTML tags. See https://stackoverflow.com/questions/17289448/angularjs-to-output-plain-text-instead-of-html
      *
      * @param text
      */
    def stripHtml(text: String): String
  }
  object SDObject {
    
    inline def apply(
      getOption: /* key */ String => Any,
      getOptions: () => ShowdownOptions,
      makeHtml: /* text */ String => String,
      stripHtml: String => String
    ): SDObject = {
      val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), makeHtml = js.Any.fromFunction1(makeHtml), stripHtml = js.Any.fromFunction1(stripHtml))
      __obj.asInstanceOf[SDObject]
    }
    
    extension [Self <: SDObject](x: Self) {
      
      inline def setGetOption(value: /* key */ String => Any): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setGetOptions(value: () => ShowdownOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
      
      inline def setMakeHtml(value: /* text */ String => String): Self = StObject.set(x, "makeHtml", js.Any.fromFunction1(value))
      
      inline def setStripHtml(value: String => String): Self = StObject.set(x, "stripHtml", js.Any.fromFunction1(value))
    }
  }
  
  trait ShowdownProvider
    extends StObject
       with IServiceProvider {
    
    @JSName("$get")
    def $get_MShowdownProvider(): SDObject
    
    /**
      * Gets the value of the configuration parameter specified by key
      *
      * @param key The config parameter key
      * @returns Returns the value of the config parameter. (or null if the config parameter is not set)
      */
    def getOption(key: String): Any
    
    /**
      * Loads a Showdown Extension
      *
      * @param extensionName The name of the extension to load
      */
    def loadExtension(extensionName: String): ShowdownProvider
    
    /**
      * Sets a configuration option
      *
      * @param key Config parameter key
      * @param value Config parameter value
      */
    def setOption(key: String, value: Any): ShowdownProvider
  }
  object ShowdownProvider {
    
    inline def apply(
      $get: () => SDObject,
      getOption: String => Any,
      loadExtension: String => ShowdownProvider,
      setOption: (String, Any) => ShowdownProvider
    ): ShowdownProvider = {
      val __obj = js.Dynamic.literal($get = js.Any.fromFunction0($get), getOption = js.Any.fromFunction1(getOption), loadExtension = js.Any.fromFunction1(loadExtension), setOption = js.Any.fromFunction2(setOption))
      __obj.asInstanceOf[ShowdownProvider]
    }
    
    extension [Self <: ShowdownProvider](x: Self) {
      
      inline def set$get(value: () => SDObject): Self = StObject.set(x, "$get", js.Any.fromFunction0(value))
      
      inline def setGetOption(value: String => Any): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setLoadExtension(value: String => ShowdownProvider): Self = StObject.set(x, "loadExtension", js.Any.fromFunction1(value))
      
      inline def setSetOption(value: (String, Any) => ShowdownProvider): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    }
  }
  
  type StripHtmlFilter = js.Function1[/* text */ String, String]
  
  /* augmented module */
  object angularAugmentingMod {
    
    // tslint:disable:interface-name
    type IFilterService = js.Function1[stripHtml, StripHtmlFilter]
  }
}
