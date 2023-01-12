package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatUserBannedMessageDetails extends StObject {
  
  /** The duration of the ban. This property is only present if the banType is temporary. */
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  
  /** The type of ban. */
  var banType: js.UndefOr[String] = js.undefined
  
  /** The details of the user that was banned. */
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}
object LiveChatUserBannedMessageDetails {
  
  inline def apply(): LiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatUserBannedMessageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveChatUserBannedMessageDetails] (val x: Self) extends AnyVal {
    
    inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
    
    inline def setBanType(value: String): Self = StObject.set(x, "banType", value.asInstanceOf[js.Any])
    
    inline def setBanTypeUndefined: Self = StObject.set(x, "banType", js.undefined)
    
    inline def setBannedUserDetails(value: ChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
    
    inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
  }
}
