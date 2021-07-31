package typings.places

import typings.node.eventsMod.EventEmitter
import typings.places.anon.Prefix
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: PlacesOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @JSImport("places", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
  
  trait AutompleteOptions extends StObject {
    
    var autoselect: Boolean
    
    var cssClasses: Prefix
    
    var debug: Boolean
    
    var hint: Boolean
  }
  object AutompleteOptions {
    
    @scala.inline
    def apply(autoselect: Boolean, cssClasses: Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
      val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutompleteOptions]
    }
    
    @scala.inline
    implicit class AutompleteOptionsMutableBuilder[Self <: AutompleteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClasses(value: Prefix): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHint(value: Boolean): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var message: String
  }
  object Error {
    
    @scala.inline
    def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Places extends StObject {
    
    var query: js.Any
    
    var rawAnswer: js.Any
    
    var suggestion: js.Any
    
    var suggestionIndex: js.Any
  }
  object Places {
    
    @scala.inline
    def apply(query: js.Any, rawAnswer: js.Any, suggestion: js.Any, suggestionIndex: js.Any): Places = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], rawAnswer = rawAnswer.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Places]
    }
    
    @scala.inline
    implicit class PlacesMutableBuilder[Self <: Places] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawAnswer(value: js.Any): Self = StObject.set(x, "rawAnswer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestion(value: js.Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionIndex(value: js.Any): Self = StObject.set(x, "suggestionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlacesOptions extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var container: String | HTMLInputElement | NodeList | Element
  }
  object PlacesOptions {
    
    @scala.inline
    def apply(apiKey: String, appId: String, container: String | HTMLInputElement | NodeList | Element): PlacesOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacesOptions]
    }
    
    @scala.inline
    implicit class PlacesOptionsMutableBuilder[Self <: PlacesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: String | HTMLInputElement | NodeList | Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
