package typings.places

import typings.node.eventsMod.EventEmitter
import typings.places.anon.Prefix
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("places", JSImport.Namespace)
  @js.native
  def apply(options: PlacesOptions): EventEmitter = js.native
  
  @JSImport("places", "version")
  @js.native
  def version(): String = js.native
  
  @js.native
  trait AutompleteOptions extends StObject {
    
    var autoselect: Boolean = js.native
    
    var cssClasses: Prefix = js.native
    
    var debug: Boolean = js.native
    
    var hint: Boolean = js.native
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
  
  @js.native
  trait Error extends StObject {
    
    var message: String = js.native
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
  
  @js.native
  trait Places extends StObject {
    
    var query: js.Any = js.native
    
    var rawAnswer: js.Any = js.native
    
    var suggestion: js.Any = js.native
    
    var suggestionIndex: js.Any = js.native
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
  
  @js.native
  trait PlacesOptions extends StObject {
    
    var apiKey: String = js.native
    
    var appId: String = js.native
    
    var container: String | HTMLInputElement | NodeList | Element = js.native
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
