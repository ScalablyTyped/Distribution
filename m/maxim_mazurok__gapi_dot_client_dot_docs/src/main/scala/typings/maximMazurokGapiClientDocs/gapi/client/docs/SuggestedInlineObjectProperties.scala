package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedInlineObjectProperties extends js.Object {
  
  /**
    * An InlineObjectProperties that only includes the changes made in this suggestion. This can be used along with the inline_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  
  /** A mask that indicates which of the fields on the base InlineObjectProperties have been changed in this suggestion. */
  var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.native
}
object SuggestedInlineObjectProperties {
  
  @scala.inline
  def apply(): SuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedInlineObjectProperties]
  }
  
  @scala.inline
  implicit class SuggestedInlineObjectPropertiesOps[Self <: SuggestedInlineObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInlineObjectProperties(value: InlineObjectProperties): Self = this.set("inlineObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineObjectProperties: Self = this.set("inlineObjectProperties", js.undefined)
    
    @scala.inline
    def setInlineObjectPropertiesSuggestionState(value: InlineObjectPropertiesSuggestionState): Self = this.set("inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineObjectPropertiesSuggestionState: Self = this.set("inlineObjectPropertiesSuggestionState", js.undefined)
  }
}
