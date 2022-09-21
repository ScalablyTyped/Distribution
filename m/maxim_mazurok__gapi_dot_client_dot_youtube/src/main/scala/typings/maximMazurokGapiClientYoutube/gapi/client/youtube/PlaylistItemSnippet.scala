package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItemSnippet extends StObject {
  
  /** The ID that YouTube uses to uniquely identify the user that added the item to the playlist. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Channel title for the channel that the playlist item belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /** The item's description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in. */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /** The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth. */
  var position: js.UndefOr[Double] = js.undefined
  
  /** The date and time that the item was added to the playlist. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The item's title. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Channel id for the channel this video belongs to. */
  var videoOwnerChannelId: js.UndefOr[String] = js.undefined
  
  /** Channel title for the channel this video belongs to. */
  var videoOwnerChannelTitle: js.UndefOr[String] = js.undefined
}
object PlaylistItemSnippet {
  
  inline def apply(): PlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItemSnippet]
  }
  
  extension [Self <: PlaylistItemSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideoOwnerChannelId(value: String): Self = StObject.set(x, "videoOwnerChannelId", value.asInstanceOf[js.Any])
    
    inline def setVideoOwnerChannelIdUndefined: Self = StObject.set(x, "videoOwnerChannelId", js.undefined)
    
    inline def setVideoOwnerChannelTitle(value: String): Self = StObject.set(x, "videoOwnerChannelTitle", value.asInstanceOf[js.Any])
    
    inline def setVideoOwnerChannelTitleUndefined: Self = StObject.set(x, "videoOwnerChannelTitle", js.undefined)
  }
}
