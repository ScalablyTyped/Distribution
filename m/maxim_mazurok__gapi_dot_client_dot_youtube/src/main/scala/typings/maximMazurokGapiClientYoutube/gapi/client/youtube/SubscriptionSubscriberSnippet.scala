package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionSubscriberSnippet extends StObject {
  
  /** The channel ID of the subscriber. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The description of the subscriber. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Thumbnails for this subscriber. */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The title of the subscriber. */
  var title: js.UndefOr[String] = js.undefined
}
object SubscriptionSubscriberSnippet {
  
  @scala.inline
  def apply(): SubscriptionSubscriberSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionSubscriberSnippet]
  }
  
  @scala.inline
  implicit class SubscriptionSubscriberSnippetMutableBuilder[Self <: SubscriptionSubscriberSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
