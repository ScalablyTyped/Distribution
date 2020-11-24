package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DigitalContentLabelTargetingOptionDetails extends js.Object {
  
  /** Output only. An enum for the content label brand safety tiers. */
  var contentRatingTier: js.UndefOr[String] = js.native
}
object DigitalContentLabelTargetingOptionDetails {
  
  @scala.inline
  def apply(): DigitalContentLabelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigitalContentLabelTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DigitalContentLabelTargetingOptionDetailsOps[Self <: DigitalContentLabelTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
  }
}
