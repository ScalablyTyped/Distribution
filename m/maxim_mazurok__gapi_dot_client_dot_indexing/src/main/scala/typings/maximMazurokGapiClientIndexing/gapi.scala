package typings.maximMazurokGapiClientIndexing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIndexing.anon.Accesstoken
import typings.maximMazurokGapiClientIndexing.anon.Alt
import typings.maximMazurokGapiClientIndexing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object indexing {
      
      trait PublishUrlNotificationResponse extends StObject {
        
        /** Description of the notification events received for this URL. */
        var urlNotificationMetadata: js.UndefOr[UrlNotificationMetadata] = js.undefined
      }
      object PublishUrlNotificationResponse {
        
        inline def apply(): PublishUrlNotificationResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PublishUrlNotificationResponse]
        }
        
        extension [Self <: PublishUrlNotificationResponse](x: Self) {
          
          inline def setUrlNotificationMetadata(value: UrlNotificationMetadata): Self = StObject.set(x, "urlNotificationMetadata", value.asInstanceOf[js.Any])
          
          inline def setUrlNotificationMetadataUndefined: Self = StObject.set(x, "urlNotificationMetadata", js.undefined)
        }
      }
      
      trait UrlNotification extends StObject {
        
        /** Creation timestamp for this notification. Users should _not_ specify it, the field is ignored at the request time. */
        var notifyTime: js.UndefOr[String] = js.undefined
        
        /** The URL life cycle event that Google is being notified about. */
        var `type`: js.UndefOr[String] = js.undefined
        
        /** The object of this notification. The URL must be owned by the publisher of this notification and, in case of `URL_UPDATED` notifications, it _must_ be crawlable by Google. */
        var url: js.UndefOr[String] = js.undefined
      }
      object UrlNotification {
        
        inline def apply(): UrlNotification = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UrlNotification]
        }
        
        extension [Self <: UrlNotification](x: Self) {
          
          inline def setNotifyTime(value: String): Self = StObject.set(x, "notifyTime", value.asInstanceOf[js.Any])
          
          inline def setNotifyTimeUndefined: Self = StObject.set(x, "notifyTime", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait UrlNotificationMetadata extends StObject {
        
        /** Latest notification received with type `URL_REMOVED`. */
        var latestRemove: js.UndefOr[UrlNotification] = js.undefined
        
        /** Latest notification received with type `URL_UPDATED`. */
        var latestUpdate: js.UndefOr[UrlNotification] = js.undefined
        
        /** URL to which this metadata refers. */
        var url: js.UndefOr[String] = js.undefined
      }
      object UrlNotificationMetadata {
        
        inline def apply(): UrlNotificationMetadata = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UrlNotificationMetadata]
        }
        
        extension [Self <: UrlNotificationMetadata](x: Self) {
          
          inline def setLatestRemove(value: UrlNotification): Self = StObject.set(x, "latestRemove", value.asInstanceOf[js.Any])
          
          inline def setLatestRemoveUndefined: Self = StObject.set(x, "latestRemove", js.undefined)
          
          inline def setLatestUpdate(value: UrlNotification): Self = StObject.set(x, "latestUpdate", value.asInstanceOf[js.Any])
          
          inline def setLatestUpdateUndefined: Self = StObject.set(x, "latestUpdate", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait UrlNotificationsResource extends StObject {
        
        /**
          * Gets metadata about a Web Document. This method can _only_ be used to query URLs that were previously seen in successful Indexing API notifications. Includes the latest
          * `UrlNotification` received via this API.
          */
        def getMetadata(): Request[UrlNotificationMetadata] = js.native
        def getMetadata(request: Accesstoken): Request[UrlNotificationMetadata] = js.native
        
        /** Notifies that a URL has been updated or deleted. */
        def publish(request: Alt): Request[PublishUrlNotificationResponse] = js.native
        def publish(request: Callback, body: UrlNotification): Request[PublishUrlNotificationResponse] = js.native
      }
    }
  }
}
