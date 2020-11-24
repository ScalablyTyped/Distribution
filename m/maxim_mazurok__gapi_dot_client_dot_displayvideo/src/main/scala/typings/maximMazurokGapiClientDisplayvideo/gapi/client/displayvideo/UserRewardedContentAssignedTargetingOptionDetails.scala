package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRewardedContentAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_USER_REWARDED_CONTENT`. */
  var targetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. User rewarded content status for video ads. */
  var userRewardedContent: js.UndefOr[String] = js.native
}
object UserRewardedContentAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): UserRewardedContentAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRewardedContentAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class UserRewardedContentAssignedTargetingOptionDetailsOps[Self <: UserRewardedContentAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
    
    @scala.inline
    def setUserRewardedContent(value: String): Self = this.set("userRewardedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRewardedContent: Self = this.set("userRewardedContent", js.undefined)
  }
}
