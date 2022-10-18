package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromSuggestions extends StObject {
  
  /**
    * The event parameter is set to true, when the button at the end of the suggestion table is clicked, otherwise
    * false. It can be used to determine whether the "value help" trigger or the "show all items" trigger has
    * been pressed.
    */
  var fromSuggestions: js.UndefOr[Boolean] = js.undefined
}
object FromSuggestions {
  
  inline def apply(): FromSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromSuggestions]
  }
  
  extension [Self <: FromSuggestions](x: Self) {
    
    inline def setFromSuggestions(value: Boolean): Self = StObject.set(x, "fromSuggestions", value.asInstanceOf[js.Any])
    
    inline def setFromSuggestionsUndefined: Self = StObject.set(x, "fromSuggestions", js.undefined)
  }
}
