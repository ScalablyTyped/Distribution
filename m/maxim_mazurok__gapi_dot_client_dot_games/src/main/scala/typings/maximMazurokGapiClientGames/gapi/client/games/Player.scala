package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.maximMazurokGapiClientGames.anon.FamilyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  /** The base URL for the image that represents the player. */
  var avatarImageUrl: js.UndefOr[String] = js.undefined
  
  /** The url to the landscape mode player banner image. */
  var bannerUrlLandscape: js.UndefOr[String] = js.undefined
  
  /** The url to the portrait mode player banner image. */
  var bannerUrlPortrait: js.UndefOr[String] = js.undefined
  
  /** The name to display for the player. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** An object to represent Play Game experience information for the player. */
  var experienceInfo: js.UndefOr[PlayerExperienceInfo] = js.undefined
  
  /** The friend status of the given player, relative to the requester. This is unset if the player is not sharing their friends list with the game. */
  var friendStatus: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#player` */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A representation of the individual components of the name. */
  var name: js.UndefOr[FamilyName] = js.undefined
  
  /**
    * The player ID that was used for this player the first time they signed into the game in question. This is only populated for calls to player.get for the requesting player, only if
    * the player ID has subsequently changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[String] = js.undefined
  
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.undefined
  
  /** The player's profile settings. Controls whether or not the player's profile is visible to other players. */
  var profileSettings: js.UndefOr[ProfileSettings] = js.undefined
  
  /** The player's title rewarded for their game activities. */
  var title: js.UndefOr[String] = js.undefined
}
object Player {
  
  inline def apply(): Player = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setAvatarImageUrl(value: String): Self = StObject.set(x, "avatarImageUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarImageUrlUndefined: Self = StObject.set(x, "avatarImageUrl", js.undefined)
    
    inline def setBannerUrlLandscape(value: String): Self = StObject.set(x, "bannerUrlLandscape", value.asInstanceOf[js.Any])
    
    inline def setBannerUrlLandscapeUndefined: Self = StObject.set(x, "bannerUrlLandscape", js.undefined)
    
    inline def setBannerUrlPortrait(value: String): Self = StObject.set(x, "bannerUrlPortrait", value.asInstanceOf[js.Any])
    
    inline def setBannerUrlPortraitUndefined: Self = StObject.set(x, "bannerUrlPortrait", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExperienceInfo(value: PlayerExperienceInfo): Self = StObject.set(x, "experienceInfo", value.asInstanceOf[js.Any])
    
    inline def setExperienceInfoUndefined: Self = StObject.set(x, "experienceInfo", js.undefined)
    
    inline def setFriendStatus(value: String): Self = StObject.set(x, "friendStatus", value.asInstanceOf[js.Any])
    
    inline def setFriendStatusUndefined: Self = StObject.set(x, "friendStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalPlayerId(value: String): Self = StObject.set(x, "originalPlayerId", value.asInstanceOf[js.Any])
    
    inline def setOriginalPlayerIdUndefined: Self = StObject.set(x, "originalPlayerId", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
    
    inline def setProfileSettings(value: ProfileSettings): Self = StObject.set(x, "profileSettings", value.asInstanceOf[js.Any])
    
    inline def setProfileSettingsUndefined: Self = StObject.set(x, "profileSettings", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
