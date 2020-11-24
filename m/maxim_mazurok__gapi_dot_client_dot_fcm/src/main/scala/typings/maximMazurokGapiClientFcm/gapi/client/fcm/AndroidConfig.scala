package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidConfig extends js.Object {
  
  /**
    * An identifier of a group of messages that can be collapsed, so that only the last message gets sent when delivery can be resumed. A maximum of 4 different collapse keys is allowed
    * at any given time.
    */
  var collapseKey: js.UndefOr[String] = js.native
  
  /** Arbitrary key/value payload. If present, it will override google.firebase.fcm.v1.Message.data. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.AndroidConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * If set to true, messages will be allowed to be delivered to the app while the device is in direct boot mode. See [Support Direct Boot
    * mode](https://developer.android.com/training/articles/direct-boot).
    */
  var directBootOk: js.UndefOr[Boolean] = js.native
  
  /** Options for features provided by the FCM SDK for Android. */
  var fcmOptions: js.UndefOr[AndroidFcmOptions] = js.native
  
  /** Notification to send to android devices. */
  var notification: js.UndefOr[AndroidNotification] = js.native
  
  /** Message priority. Can take "normal" and "high" values. For more information, see [Setting the priority of a message](https://goo.gl/GjONJv). */
  var priority: js.UndefOr[String] = js.native
  
  /** Package name of the application where the registration token must match in order to receive the message. */
  var restrictedPackageName: js.UndefOr[String] = js.native
  
  /**
    * How long (in seconds) the message should be kept in FCM storage if the device is offline. The maximum time to live supported is 4 weeks, and the default value is 4 weeks if not set.
    * Set it to 0 if want to send the message immediately. In JSON format, the Duration type is encoded as a string rather than an object, where the string ends in the suffix "s"
    * (indicating seconds) and is preceded by the number of seconds, with nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in JSON
    * format as "3s", while 3 seconds and 1 nanosecond should be expressed in JSON format as "3.000000001s". The ttl will be rounded down to the nearest second.
    */
  var ttl: js.UndefOr[String] = js.native
}
object AndroidConfig {
  
  @scala.inline
  def apply(): AndroidConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidConfig]
  }
  
  @scala.inline
  implicit class AndroidConfigOps[Self <: AndroidConfig] (val x: Self) extends AnyVal {
    
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
    def setCollapseKey(value: String): Self = this.set("collapseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseKey: Self = this.set("collapseKey", js.undefined)
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.AndroidConfig with TopLevel[js.Any]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDirectBootOk(value: Boolean): Self = this.set("directBootOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectBootOk: Self = this.set("directBootOk", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: AndroidFcmOptions): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    
    @scala.inline
    def setNotification(value: AndroidNotification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setRestrictedPackageName(value: String): Self = this.set("restrictedPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedPackageName: Self = this.set("restrictedPackageName", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
