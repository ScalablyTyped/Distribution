package typings.postcssModules

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Plugin
import typings.postcssModules.postcssModulesBooleans.`true`
import typings.postcssModules.postcssModulesStrings.camelCase
import typings.postcssModules.postcssModulesStrings.camelCaseOnly
import typings.postcssModules.postcssModulesStrings.dashes
import typings.postcssModules.postcssModulesStrings.dashesOnly
import typings.postcssModules.postcssModulesStrings.global
import typings.postcssModules.postcssModulesStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules", JSImport.Namespace)
  @js.native
  val ^ : PostcssModulesPlugin = js.native
  
  type GenerateScopedNameFunction = js.Function3[/* name */ String, /* filename */ String, /* css */ String, String]
  
  trait Loader extends StObject {
    
    def fetch(file: String, relativeTo: String, depTrace: String): js.Promise[StringDictionary[String]]
    
    var finalSource: js.UndefOr[String] = js.undefined
  }
  object Loader {
    
    inline def apply(fetch: (String, String, String) => js.Promise[StringDictionary[String]]): Loader = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction3(fetch))
      __obj.asInstanceOf[Loader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
      
      inline def setFetch(value: (String, String, String) => js.Promise[StringDictionary[String]]): Self = StObject.set(x, "fetch", js.Any.fromFunction3(value))
      
      inline def setFinalSource(value: String): Self = StObject.set(x, "finalSource", value.asInstanceOf[js.Any])
      
      inline def setFinalSourceUndefined: Self = StObject.set(x, "finalSource", js.undefined)
    }
  }
  
  type LocalsConventionFunction = js.Function3[
    /* originalClassName */ String, 
    /* generatedClassName */ String, 
    /* inputFile */ String, 
    String
  ]
  
  trait Options extends StObject {
    
    var Loader: js.UndefOr[
        Instantiable2[/* root */ String, /* plugins */ js.Array[Plugin], typings.postcssModules.mod.Loader]
      ] = js.undefined
    
    var exportGlobals: js.UndefOr[Boolean] = js.undefined
    
    var generateScopedName: js.UndefOr[String | GenerateScopedNameFunction] = js.undefined
    
    var getJSON: js.UndefOr[
        js.Function3[
          /* cssFilename */ String, 
          /* json */ StringDictionary[String], 
          /* outputFilename */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    var globalModulePaths: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var hashPrefix: js.UndefOr[String] = js.undefined
    
    var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly | LocalsConventionFunction] = js.undefined
    
    var resolve: js.UndefOr[js.Function1[/* file */ String, String | js.Promise[String]]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var scopeBehaviour: js.UndefOr[global | local] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExportGlobals(value: Boolean): Self = StObject.set(x, "exportGlobals", value.asInstanceOf[js.Any])
      
      inline def setExportGlobalsUndefined: Self = StObject.set(x, "exportGlobals", js.undefined)
      
      inline def setGenerateScopedName(value: String | GenerateScopedNameFunction): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
      
      inline def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
      
      inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      
      inline def setGetJSON(
        value: (/* cssFilename */ String, /* json */ StringDictionary[String], /* outputFilename */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "getJSON", js.Any.fromFunction3(value))
      
      inline def setGetJSONUndefined: Self = StObject.set(x, "getJSON", js.undefined)
      
      inline def setGlobalModulePaths(value: js.Array[js.RegExp]): Self = StObject.set(x, "globalModulePaths", value.asInstanceOf[js.Any])
      
      inline def setGlobalModulePathsUndefined: Self = StObject.set(x, "globalModulePaths", js.undefined)
      
      inline def setGlobalModulePathsVarargs(value: js.RegExp*): Self = StObject.set(x, "globalModulePaths", js.Array(value*))
      
      inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      inline def setLoader(value: Instantiable2[/* root */ String, /* plugins */ js.Array[Plugin], Loader]): Self = StObject.set(x, "Loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "Loader", js.undefined)
      
      inline def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly | LocalsConventionFunction): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
      
      inline def setLocalsConventionFunction3(
        value: (/* originalClassName */ String, /* generatedClassName */ String, /* inputFile */ String) => String
      ): Self = StObject.set(x, "localsConvention", js.Any.fromFunction3(value))
      
      inline def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
      
      inline def setResolve(value: /* file */ String => String | js.Promise[String]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScopeBehaviour(value: global | local): Self = StObject.set(x, "scopeBehaviour", value.asInstanceOf[js.Any])
      
      inline def setScopeBehaviourUndefined: Self = StObject.set(x, "scopeBehaviour", js.undefined)
    }
  }
  
  @js.native
  trait PostcssModulesPlugin extends StObject {
    
    def apply(options: Options): Plugin = js.native
    
    var postcss: `true` = js.native
  }
  
  type _To = PostcssModulesPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PostcssModulesPlugin = ^
}
