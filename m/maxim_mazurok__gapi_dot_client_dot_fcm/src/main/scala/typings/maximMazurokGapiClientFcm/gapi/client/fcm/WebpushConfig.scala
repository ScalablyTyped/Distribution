package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpushConfig extends js.Object {
  
  /** Arbitrary key/value payload. If present, it will override google.firebase.fcm.v1.Message.data. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
  ] = js.native
  
  /** Options for features provided by the FCM SDK for Web. */
  var fcmOptions: js.UndefOr[WebpushFcmOptions] = js.native
  
  /** HTTP headers defined in webpush protocol. Refer to [Webpush protocol](https://tools.ietf.org/html/rfc8030#section-5) for supported headers, e.g. "TTL": "15". */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Web Notification options as a JSON object. Supports Notification instance properties as defined in [Web Notification
    * API](https://developer.mozilla.org/en-US/docs/Web/API/Notification). If present, "title" and "body" fields override [google.firebase.fcm.v1.Notification.title] and
    * [google.firebase.fcm.v1.Notification.body].
    */
  var notification: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
  ] = js.native
}
object WebpushConfig {
  
  @scala.inline
  def apply(): WebpushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushConfig]
  }
  
  @scala.inline
  implicit class WebpushConfigOps[Self <: WebpushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: WebpushFcmOptions): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
    ): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNotification(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.WebpushConfig with TopLevel[js.Any]
    ): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
  }
}
