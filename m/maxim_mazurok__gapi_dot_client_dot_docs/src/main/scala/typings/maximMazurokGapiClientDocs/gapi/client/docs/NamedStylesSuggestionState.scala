package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedStylesSuggestionState extends js.Object {
  
  /**
    * A mask that indicates which of the fields on the corresponding NamedStyle in styles have been changed in this suggestion. The order of these named style suggestion states match the
    * order of the corresponding named style within the named styles suggestion.
    */
  var stylesSuggestionStates: js.UndefOr[js.Array[NamedStyleSuggestionState]] = js.native
}
object NamedStylesSuggestionState {
  
  @scala.inline
  def apply(): NamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStylesSuggestionState]
  }
  
  @scala.inline
  implicit class NamedStylesSuggestionStateOps[Self <: NamedStylesSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setStylesSuggestionStatesVarargs(value: NamedStyleSuggestionState*): Self = this.set("stylesSuggestionStates", js.Array(value :_*))
    
    @scala.inline
    def setStylesSuggestionStates(value: js.Array[NamedStyleSuggestionState]): Self = this.set("stylesSuggestionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesSuggestionStates: Self = this.set("stylesSuggestionStates", js.undefined)
  }
}
