package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /** Input only. Android specific options for messages sent through [FCM connection server](https://goo.gl/4GLdUl). */
  var android: js.UndefOr[AndroidConfig] = js.undefined
  
  /** Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options. */
  var apns: js.UndefOr[ApnsConfig] = js.undefined
  
  /** Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics". */
  var condition: js.UndefOr[String] = js.undefined
  
  /** Input only. Arbitrary key/value payload. The key should not be a reserved word ("from", "message_type", or any word starting with "google" or "gcm"). */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message & TopLevel[js.Any]
  ] = js.undefined
  
  /** Input only. Template for FCM SDK feature options to use across all platforms. */
  var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
  
  /** Output Only. The identifier of the message sent, in the format of `projects/∗/messages/{message_id}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Input only. Basic notification template to use across all platforms. */
  var notification: js.UndefOr[Notification] = js.undefined
  
  /** Registration token to send a message to. */
  var token: js.UndefOr[String] = js.undefined
  
  /** Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be provided. */
  var topic: js.UndefOr[String] = js.undefined
  
  /** Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options. */
  var webpush: js.UndefOr[WebpushConfig] = js.undefined
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: AndroidConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setApns(value: ApnsConfig): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message & TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setWebpush(value: WebpushConfig): Self = StObject.set(x, "webpush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpushUndefined: Self = StObject.set(x, "webpush", js.undefined)
  }
}
