package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRewardedContentAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_USER_REWARDED_CONTENT`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
  
  /** Output only. User rewarded content status for video ads. */
  var userRewardedContent: js.UndefOr[String] = js.undefined
}
object UserRewardedContentAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): UserRewardedContentAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRewardedContentAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class UserRewardedContentAssignedTargetingOptionDetailsMutableBuilder[Self <: UserRewardedContentAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    @scala.inline
    def setUserRewardedContent(value: String): Self = StObject.set(x, "userRewardedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRewardedContentUndefined: Self = StObject.set(x, "userRewardedContent", js.undefined)
  }
}
