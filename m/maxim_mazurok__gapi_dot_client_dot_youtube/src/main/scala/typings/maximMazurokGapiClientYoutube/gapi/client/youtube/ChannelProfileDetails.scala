package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelProfileDetails extends StObject {
  
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The channel's URL. */
  var channelUrl: js.UndefOr[String] = js.undefined
  
  /** The channel's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[String] = js.undefined
}
object ChannelProfileDetails {
  
  @scala.inline
  def apply(): ChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelProfileDetails]
  }
  
  @scala.inline
  implicit class ChannelProfileDetailsMutableBuilder[Self <: ChannelProfileDetails] (val x: Self) extends AnyVal {
    
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
    def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
  }
}
