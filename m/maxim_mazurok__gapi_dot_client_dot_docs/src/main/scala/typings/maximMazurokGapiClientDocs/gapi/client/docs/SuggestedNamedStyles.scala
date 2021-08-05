package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedNamedStyles extends StObject {
  
  /**
    * A NamedStyles that only includes the changes made in this suggestion. This can be used along with the named_styles_suggestion_state to see which fields have changed and their new
    * values.
    */
  var namedStyles: js.UndefOr[NamedStyles] = js.undefined
  
  /** A mask that indicates which of the fields on the base NamedStyles have been changed in this suggestion. */
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.undefined
}
object SuggestedNamedStyles {
  
  inline def apply(): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
  
  extension [Self <: SuggestedNamedStyles](x: Self) {
    
    inline def setNamedStyles(value: NamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
    
    inline def setNamedStylesSuggestionState(value: NamedStylesSuggestionState): Self = StObject.set(x, "namedStylesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setNamedStylesSuggestionStateUndefined: Self = StObject.set(x, "namedStylesSuggestionState", js.undefined)
    
    inline def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
  }
}
