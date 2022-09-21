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
  
  /**
    * Input only. Arbitrary key/value payload, which must be UTF-8 encoded. The key should not be a reserved word ("from", "message_type", or any word starting with "google" or "gcm").
    * When sending payloads containing only data fields to iOS devices, only normal priority (`"apns-priority": "5"`) is allowed in
    * [`ApnsConfig`](/docs/reference/fcm/rest/v1/projects.messages#apnsconfig).
    */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message & TopLevel[Any]
  ] = js.undefined
  
  /** Input only. Template for FCM SDK feature options to use across all platforms. */
  var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
  
  /** Output Only. The identifier of the message sent, in the format of `projects/ *‍/messages/{message_id}`. */
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
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setAndroid(value: AndroidConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setApns(value: ApnsConfig): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message & TopLevel[Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setWebpush(value: WebpushConfig): Self = StObject.set(x, "webpush", value.asInstanceOf[js.Any])
    
    inline def setWebpushUndefined: Self = StObject.set(x, "webpush", js.undefined)
  }
}
