package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.maximMazurokGapiClientGamesmanagement.anon.FamilyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends StObject {
  
  /** The base URL for the image that represents the player. */
  var avatarImageUrl: js.UndefOr[String] = js.native
  
  /** The url to the landscape mode player banner image. */
  var bannerUrlLandscape: js.UndefOr[String] = js.native
  
  /** The url to the portrait mode player banner image. */
  var bannerUrlPortrait: js.UndefOr[String] = js.native
  
  /** The name to display for the player. */
  var displayName: js.UndefOr[String] = js.native
  
  /** An object to represent Play Game experience information for the player. */
  var experienceInfo: js.UndefOr[GamesPlayerExperienceInfoResource] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#player`. */
  var kind: js.UndefOr[String] = js.native
  
  /** An object representation of the individual components of the player's name. For some players, these fields may not be present. */
  var name: js.UndefOr[FamilyName] = js.native
  
  /**
    * The player ID that was used for this player the first time they signed into the game in question. This is only populated for calls to player.get for the requesting player, only if
    * the player ID has subsequently changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[String] = js.native
  
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.native
  
  /** The player's profile settings. Controls whether or not the player's profile is visible to other players. */
  var profileSettings: js.UndefOr[ProfileSettings] = js.native
  
  /** The player's title rewarded for their game activities. */
  var title: js.UndefOr[String] = js.native
}
object Player {
  
  @scala.inline
  def apply(): Player = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Player]
  }
  
  @scala.inline
  implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatarImageUrl(value: String): Self = StObject.set(x, "avatarImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarImageUrlUndefined: Self = StObject.set(x, "avatarImageUrl", js.undefined)
    
    @scala.inline
    def setBannerUrlLandscape(value: String): Self = StObject.set(x, "bannerUrlLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerUrlLandscapeUndefined: Self = StObject.set(x, "bannerUrlLandscape", js.undefined)
    
    @scala.inline
    def setBannerUrlPortrait(value: String): Self = StObject.set(x, "bannerUrlPortrait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerUrlPortraitUndefined: Self = StObject.set(x, "bannerUrlPortrait", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExperienceInfo(value: GamesPlayerExperienceInfoResource): Self = StObject.set(x, "experienceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperienceInfoUndefined: Self = StObject.set(x, "experienceInfo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalPlayerId(value: String): Self = StObject.set(x, "originalPlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPlayerIdUndefined: Self = StObject.set(x, "originalPlayerId", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
    
    @scala.inline
    def setProfileSettings(value: ProfileSettings): Self = StObject.set(x, "profileSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileSettingsUndefined: Self = StObject.set(x, "profileSettings", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
