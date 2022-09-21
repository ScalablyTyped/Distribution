package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveBroadcastSnippet extends StObject {
  
  /** The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete. */
  var actualEndTime: js.UndefOr[String] = js.undefined
  
  /** The date and time that the broadcast actually started. This information is only available once the broadcast's state is live. */
  var actualStartTime: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the corresponding video resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Indicates whether this broadcast is the default broadcast. Internal only. */
  var isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined
  
  /** The id of the live chat for this broadcast. */
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /** The date and time that the broadcast was added to YouTube's live broadcast schedule. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** The date and time that the broadcast is scheduled to end. */
  var scheduledEndTime: js.UndefOr[String] = js.undefined
  
  /** The date and time that the broadcast is scheduled to start. */
  var scheduledStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the broadcast. For each nested object in this object, the key is the name of the thumbnail image, and the value is an object that contains
    * other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /**
    * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by setting the title field of the
    * corresponding video resource.
    */
  var title: js.UndefOr[String] = js.undefined
}
object LiveBroadcastSnippet {
  
  inline def apply(): LiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastSnippet]
  }
  
  extension [Self <: LiveBroadcastSnippet](x: Self) {
    
    inline def setActualEndTime(value: String): Self = StObject.set(x, "actualEndTime", value.asInstanceOf[js.Any])
    
    inline def setActualEndTimeUndefined: Self = StObject.set(x, "actualEndTime", js.undefined)
    
    inline def setActualStartTime(value: String): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
    
    inline def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsDefaultBroadcast(value: Boolean): Self = StObject.set(x, "isDefaultBroadcast", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultBroadcastUndefined: Self = StObject.set(x, "isDefaultBroadcast", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
    
    inline def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
    
    inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
