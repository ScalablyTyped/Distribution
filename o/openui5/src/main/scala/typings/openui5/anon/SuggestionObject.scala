package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionObject extends StObject {
  
  /**
    * Any object used to find the suggested token
    */
  var suggestionObject: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The source text {sap.m.Token}
    */
  var text: String
  
  /**
    * Suggested token
    */
  var token: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Callback which gets called after validation has finished
    */
  var validationCallback: js.UndefOr[js.Function] = js.undefined
}
object SuggestionObject {
  
  inline def apply(text: String): SuggestionObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionObject] (val x: Self) extends AnyVal {
    
    inline def setSuggestionObject(value: js.Object): Self = StObject.set(x, "suggestionObject", value.asInstanceOf[js.Any])
    
    inline def setSuggestionObjectUndefined: Self = StObject.set(x, "suggestionObject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setToken(value: js.Object): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setValidationCallback(value: js.Function): Self = StObject.set(x, "validationCallback", value.asInstanceOf[js.Any])
    
    inline def setValidationCallbackUndefined: Self = StObject.set(x, "validationCallback", js.undefined)
  }
}
