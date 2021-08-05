package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnsConfig extends StObject {
  
  /** Options for features provided by the FCM SDK for iOS. */
  var fcmOptions: js.UndefOr[ApnsFcmOptions] = js.undefined
  
  /**
    * HTTP request headers defined in Apple Push Notification Service. Refer to [APNs request
    * headers](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/sending_notification_requests_to_apns) for supported headers, e.g.
    * "apns-priority": "10".
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.ApnsConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * APNs payload as a JSON object, including both `aps` dictionary and custom payload. See [Payload Key
    * Reference](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification). If present, it overrides
    * google.firebase.fcm.v1.Notification.title and google.firebase.fcm.v1.Notification.body.
    */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.ApnsConfig & TopLevel[js.Any]
  ] = js.undefined
}
object ApnsConfig {
  
  inline def apply(): ApnsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsConfig]
  }
  
  extension [Self <: ApnsConfig](x: Self) {
    
    inline def setFcmOptions(value: ApnsFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.ApnsConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.ApnsConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
