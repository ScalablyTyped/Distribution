package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordListAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. ID of the negative keyword list. Should refer to the negative_keyword_list_id field of a NegativeKeywordList resource. */
  var negativeKeywordListId: js.UndefOr[String] = js.native
}
object NegativeKeywordListAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): NegativeKeywordListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeywordListAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class NegativeKeywordListAssignedTargetingOptionDetailsOps[Self <: NegativeKeywordListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setNegativeKeywordListId(value: String): Self = this.set("negativeKeywordListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywordListId: Self = this.set("negativeKeywordListId", js.undefined)
  }
}
