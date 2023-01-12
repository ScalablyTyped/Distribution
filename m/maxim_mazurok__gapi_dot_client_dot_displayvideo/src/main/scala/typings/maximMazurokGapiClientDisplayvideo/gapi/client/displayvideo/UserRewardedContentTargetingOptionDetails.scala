package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRewardedContentTargetingOptionDetails extends StObject {
  
  /** Output only. User rewarded content status for video ads. */
  var userRewardedContent: js.UndefOr[String] = js.undefined
}
object UserRewardedContentTargetingOptionDetails {
  
  inline def apply(): UserRewardedContentTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRewardedContentTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserRewardedContentTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setUserRewardedContent(value: String): Self = StObject.set(x, "userRewardedContent", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentUndefined: Self = StObject.set(x, "userRewardedContent", js.undefined)
  }
}
