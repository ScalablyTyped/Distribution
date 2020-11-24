package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRewardedContentTargetingOptionDetails extends js.Object {
  
  /** Output only. User rewarded content status for video ads. */
  var userRewardedContent: js.UndefOr[String] = js.native
}
object UserRewardedContentTargetingOptionDetails {
  
  @scala.inline
  def apply(): UserRewardedContentTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRewardedContentTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class UserRewardedContentTargetingOptionDetailsOps[Self <: UserRewardedContentTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setUserRewardedContent(value: String): Self = this.set("userRewardedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRewardedContent: Self = this.set("userRewardedContent", js.undefined)
  }
}
