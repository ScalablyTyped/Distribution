package typings.maximMazurokGapiClientIndexing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIndexing.anon.Accesstoken
import typings.maximMazurokGapiClientIndexing.anon.Alt
import typings.maximMazurokGapiClientIndexing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object indexing {
      
      @js.native
      trait PublishUrlNotificationResponse extends StObject {
        
        /** Description of the notification events received for this URL. */
        var urlNotificationMetadata: js.UndefOr[UrlNotificationMetadata] = js.native
      }
      object PublishUrlNotificationResponse {
        
        @scala.inline
        def apply(): PublishUrlNotificationResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PublishUrlNotificationResponse]
        }
        
        @scala.inline
        implicit class PublishUrlNotificationResponseMutableBuilder[Self <: PublishUrlNotificationResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setUrlNotificationMetadata(value: UrlNotificationMetadata): Self = StObject.set(x, "urlNotificationMetadata", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlNotificationMetadataUndefined: Self = StObject.set(x, "urlNotificationMetadata", js.undefined)
        }
      }
      
      @js.native
      trait UrlNotification extends StObject {
        
        /** Creation timestamp for this notification. Users should _not_ specify it, the field is ignored at the request time. */
        var notifyTime: js.UndefOr[String] = js.native
        
        /** The URL life cycle event that Google is being notified about. */
        var `type`: js.UndefOr[String] = js.native
        
        /** The object of this notification. The URL must be owned by the publisher of this notification and, in case of `URL_UPDATED` notifications, it _must_ be crawlable by Google. */
        var url: js.UndefOr[String] = js.native
      }
      object UrlNotification {
        
        @scala.inline
        def apply(): UrlNotification = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UrlNotification]
        }
        
        @scala.inline
        implicit class UrlNotificationMutableBuilder[Self <: UrlNotification] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNotifyTime(value: String): Self = StObject.set(x, "notifyTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNotifyTimeUndefined: Self = StObject.set(x, "notifyTime", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait UrlNotificationMetadata extends StObject {
        
        /** Latest notification received with type `URL_REMOVED`. */
        var latestRemove: js.UndefOr[UrlNotification] = js.native
        
        /** Latest notification received with type `URL_UPDATED`. */
        var latestUpdate: js.UndefOr[UrlNotification] = js.native
        
        /** URL to which this metadata refers. */
        var url: js.UndefOr[String] = js.native
      }
      object UrlNotificationMetadata {
        
        @scala.inline
        def apply(): UrlNotificationMetadata = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UrlNotificationMetadata]
        }
        
        @scala.inline
        implicit class UrlNotificationMetadataMutableBuilder[Self <: UrlNotificationMetadata] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLatestRemove(value: UrlNotification): Self = StObject.set(x, "latestRemove", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLatestRemoveUndefined: Self = StObject.set(x, "latestRemove", js.undefined)
          
          @scala.inline
          def setLatestUpdate(value: UrlNotification): Self = StObject.set(x, "latestUpdate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLatestUpdateUndefined: Self = StObject.set(x, "latestUpdate", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
