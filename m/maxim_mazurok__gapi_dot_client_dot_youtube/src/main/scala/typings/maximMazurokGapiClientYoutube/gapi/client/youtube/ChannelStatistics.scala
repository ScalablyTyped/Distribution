package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStatistics extends StObject {
  
  /** The number of comments for the channel. */
  var commentCount: js.UndefOr[String] = js.undefined
  
  /** Whether or not the number of subscribers is shown for this user. */
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.undefined
  
  /** The number of subscribers that the channel has. */
  var subscriberCount: js.UndefOr[String] = js.undefined
  
  /** The number of videos uploaded to the channel. */
  var videoCount: js.UndefOr[String] = js.undefined
  
  /** The number of times the channel has been viewed. */
  var viewCount: js.UndefOr[String] = js.undefined
}
object ChannelStatistics {
  
  inline def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  
  extension [Self <: ChannelStatistics](x: Self) {
    
    inline def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
    
    inline def setHiddenSubscriberCount(value: Boolean): Self = StObject.set(x, "hiddenSubscriberCount", value.asInstanceOf[js.Any])
    
    inline def setHiddenSubscriberCountUndefined: Self = StObject.set(x, "hiddenSubscriberCount", js.undefined)
    
    inline def setSubscriberCount(value: String): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
    
    inline def setSubscriberCountUndefined: Self = StObject.set(x, "subscriberCount", js.undefined)
    
    inline def setVideoCount(value: String): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    inline def setVideoCountUndefined: Self = StObject.set(x, "videoCount", js.undefined)
    
    inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
