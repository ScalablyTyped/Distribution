package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpushConfig extends StObject {
  
  /** Arbitrary key/value payload. If present, it will override google.firebase.fcm.v1.Message.data. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /** Options for features provided by the FCM SDK for Web. */
  var fcmOptions: js.UndefOr[WebpushFcmOptions] = js.undefined
  
  /** HTTP headers defined in webpush protocol. Refer to [Webpush protocol](https://tools.ietf.org/html/rfc8030#section-5) for supported headers, e.g. "TTL": "15". */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Web Notification options as a JSON object. Supports Notification instance properties as defined in [Web Notification
    * API](https://developer.mozilla.org/en-US/docs/Web/API/Notification). If present, "title" and "body" fields override [google.firebase.fcm.v1.Notification.title] and
    * [google.firebase.fcm.v1.Notification.body].
    */
  var notification: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
  ] = js.undefined
}
object WebpushConfig {
  
  @scala.inline
  def apply(): WebpushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushConfig]
  }
  
  @scala.inline
  implicit class WebpushConfigMutableBuilder[Self <: WebpushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: WebpushFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setNotification(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
