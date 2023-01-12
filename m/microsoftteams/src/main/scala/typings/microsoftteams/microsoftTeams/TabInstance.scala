package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a tab instance
  */
trait TabInstance extends StObject {
  
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Is this tab in a favorite channel?
    */
  var channelIsFavorite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[String] = js.undefined
  
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Internal: do not use
    */
  var internalTabInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Last viewed time of this tab. null means unknown
    */
  var lastViewUnixEpochTime: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tab
    */
  var tabName: String
  
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[String] = js.undefined
  
  /**
    * Is this tab in a favorite team?
    */
  var teamIsFavorite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[String] = js.undefined
  
  /**
    * Content URL of this tab
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Website URL of this tab
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object TabInstance {
  
  inline def apply(tabName: String): TabInstance = {
    val __obj = js.Dynamic.literal(tabName = tabName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabInstance] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelIsFavorite(value: Boolean): Self = StObject.set(x, "channelIsFavorite", value.asInstanceOf[js.Any])
    
    inline def setChannelIsFavoriteUndefined: Self = StObject.set(x, "channelIsFavorite", js.undefined)
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setInternalTabInstanceId(value: String): Self = StObject.set(x, "internalTabInstanceId", value.asInstanceOf[js.Any])
    
    inline def setInternalTabInstanceIdUndefined: Self = StObject.set(x, "internalTabInstanceId", js.undefined)
    
    inline def setLastViewUnixEpochTime(value: String): Self = StObject.set(x, "lastViewUnixEpochTime", value.asInstanceOf[js.Any])
    
    inline def setLastViewUnixEpochTimeUndefined: Self = StObject.set(x, "lastViewUnixEpochTime", js.undefined)
    
    inline def setTabName(value: String): Self = StObject.set(x, "tabName", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    
    inline def setTeamIsFavorite(value: Boolean): Self = StObject.set(x, "teamIsFavorite", value.asInstanceOf[js.Any])
    
    inline def setTeamIsFavoriteUndefined: Self = StObject.set(x, "teamIsFavorite", js.undefined)
    
    inline def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
