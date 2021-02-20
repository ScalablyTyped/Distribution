package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineObjectPropertiesSuggestionState extends StObject {
  
  /** A mask that indicates which of the fields in embedded_object have been changed in this suggestion. */
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.native
}
object InlineObjectPropertiesSuggestionState {
  
  @scala.inline
  def apply(): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class InlineObjectPropertiesSuggestionStateMutableBuilder[Self <: InlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
  }
}
