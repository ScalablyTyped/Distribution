package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRewardedContentTargetingOptionDetails extends StObject {
  
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
  implicit class UserRewardedContentTargetingOptionDetailsMutableBuilder[Self <: UserRewardedContentTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserRewardedContent(value: String): Self = StObject.set(x, "userRewardedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRewardedContentUndefined: Self = StObject.set(x, "userRewardedContent", js.undefined)
  }
}
