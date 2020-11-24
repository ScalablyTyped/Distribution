package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DigitalContentLabelAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The display name of the digital content label rating tier. */
  var contentRatingTier: js.UndefOr[String] = js.native
  
  /** Required. ID of the digital content label to be EXCLUDED. */
  var excludedTargetingOptionId: js.UndefOr[String] = js.native
}
object DigitalContentLabelAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): DigitalContentLabelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigitalContentLabelAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DigitalContentLabelAssignedTargetingOptionDetailsOps[Self <: DigitalContentLabelAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setContentRatingTier(value: String): Self = this.set("contentRatingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRatingTier: Self = this.set("contentRatingTier", js.undefined)
    
    @scala.inline
    def setExcludedTargetingOptionId(value: String): Self = this.set("excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedTargetingOptionId: Self = this.set("excludedTargetingOptionId", js.undefined)
  }
}
