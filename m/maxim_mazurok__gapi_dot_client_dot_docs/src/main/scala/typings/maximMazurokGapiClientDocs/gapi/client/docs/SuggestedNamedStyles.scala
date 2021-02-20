package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedNamedStyles extends StObject {
  
  /**
    * A NamedStyles that only includes the changes made in this suggestion. This can be used along with the named_styles_suggestion_state to see which fields have changed and their new
    * values.
    */
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  
  /** A mask that indicates which of the fields on the base NamedStyles have been changed in this suggestion. */
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.native
}
object SuggestedNamedStyles {
  
  @scala.inline
  def apply(): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
  
  @scala.inline
  implicit class SuggestedNamedStylesMutableBuilder[Self <: SuggestedNamedStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedStyles(value: NamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStylesSuggestionState(value: NamedStylesSuggestionState): Self = StObject.set(x, "namedStylesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStylesSuggestionStateUndefined: Self = StObject.set(x, "namedStylesSuggestionState", js.undefined)
    
    @scala.inline
    def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
  }
}
