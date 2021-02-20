package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessageAuthorDetails extends StObject {
  
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[String] = js.native
  
  /** The channel's URL. */
  var channelUrl: js.UndefOr[String] = js.native
  
  /** The channel's display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Whether the author is a moderator of the live chat. */
  var isChatModerator: js.UndefOr[Boolean] = js.native
  
  /** Whether the author is the owner of the live chat. */
  var isChatOwner: js.UndefOr[Boolean] = js.native
  
  /** Whether the author is a sponsor of the live chat. */
  var isChatSponsor: js.UndefOr[Boolean] = js.native
  
  /** Whether the author's identity has been verified by YouTube. */
  var isVerified: js.UndefOr[Boolean] = js.native
  
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[String] = js.native
}
object LiveChatMessageAuthorDetails {
  
  @scala.inline
  def apply(): LiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageAuthorDetails]
  }
  
  @scala.inline
  implicit class LiveChatMessageAuthorDetailsMutableBuilder[Self <: LiveChatMessageAuthorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsChatModerator(value: Boolean): Self = StObject.set(x, "isChatModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChatModeratorUndefined: Self = StObject.set(x, "isChatModerator", js.undefined)
    
    @scala.inline
    def setIsChatOwner(value: Boolean): Self = StObject.set(x, "isChatOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChatOwnerUndefined: Self = StObject.set(x, "isChatOwner", js.undefined)
    
    @scala.inline
    def setIsChatSponsor(value: Boolean): Self = StObject.set(x, "isChatSponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChatSponsorUndefined: Self = StObject.set(x, "isChatSponsor", js.undefined)
    
    @scala.inline
    def setIsVerified(value: Boolean): Self = StObject.set(x, "isVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerifiedUndefined: Self = StObject.set(x, "isVerified", js.undefined)
    
    @scala.inline
    def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
  }
}
