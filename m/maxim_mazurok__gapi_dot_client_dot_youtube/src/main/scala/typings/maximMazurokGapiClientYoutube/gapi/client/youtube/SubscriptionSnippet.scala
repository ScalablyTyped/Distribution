package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionSnippet extends StObject {
  
  /** The ID that YouTube uses to uniquely identify the subscriber's channel. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Channel title for the channel that the subscription belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /** The subscription's details. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The date and time that the subscription was created. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** The id object contains information about the channel that the user subscribed to. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The subscription's title. */
  var title: js.UndefOr[String] = js.undefined
}
object SubscriptionSnippet {
  
  inline def apply(): SubscriptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionSnippet]
  }
  
  extension [Self <: SubscriptionSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
