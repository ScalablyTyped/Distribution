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
  
  inline def apply(options: PlacesOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @JSImport("places", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
  
  trait AutompleteOptions extends StObject {
    
    var autoselect: Boolean
    
    var cssClasses: Prefix
    
    var debug: Boolean
    
    var hint: Boolean
  }
  object AutompleteOptions {
    
    inline def apply(autoselect: Boolean, cssClasses: Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
      val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutompleteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutompleteOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
      
      inline def setCssClasses(value: Prefix): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setHint(value: Boolean): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var message: String
  }
  object Error {
    
    inline def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Places extends StObject {
    
    var query: Any
    
    var rawAnswer: Any
    
    var suggestion: Any
    
    var suggestionIndex: Any
  }
  object Places {
    
    inline def apply(query: Any, rawAnswer: Any, suggestion: Any, suggestionIndex: Any): Places = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], rawAnswer = rawAnswer.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Places]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Places] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRawAnswer(value: Any): Self = StObject.set(x, "rawAnswer", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setSuggestionIndex(value: Any): Self = StObject.set(x, "suggestionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlacesOptions extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var container: String | HTMLInputElement | NodeList | Element
  }
  object PlacesOptions {
    
    inline def apply(apiKey: String, appId: String, container: String | HTMLInputElement | NodeList | Element): PlacesOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlacesOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String | HTMLInputElement | NodeList | Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
