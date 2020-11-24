package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletSuggestionState extends js.Object {
  
  /** Indicates if there was a suggested change to the list_id. */
  var listIdSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to the nesting_level. */
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in text style have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}
object BulletSuggestionState {
  
  @scala.inline
  def apply(): BulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletSuggestionState]
  }
  
  @scala.inline
  implicit class BulletSuggestionStateOps[Self <: BulletSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setListIdSuggested(value: Boolean): Self = this.set("listIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListIdSuggested: Self = this.set("listIdSuggested", js.undefined)
    
    @scala.inline
    def setNestingLevelSuggested(value: Boolean): Self = this.set("nestingLevelSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevelSuggested: Self = this.set("nestingLevelSuggested", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = this.set("textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyleSuggestionState: Self = this.set("textStyleSuggestionState", js.undefined)
  }
}
