package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsFcmOptions extends js.Object {
  
  /** Label associated with the message's analytics data. */
  var analyticsLabel: js.UndefOr[String] = js.native
  
  /** Contains the URL of an image that is going to be displayed in a notification. If present, it will override google.firebase.fcm.v1.Notification.image. */
  var image: js.UndefOr[String] = js.native
}
object ApnsFcmOptions {
  
  @scala.inline
  def apply(): ApnsFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsFcmOptions]
  }
  
  @scala.inline
  implicit class ApnsFcmOptionsOps[Self <: ApnsFcmOptions] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsLabel(value: String): Self = this.set("analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsLabel: Self = this.set("analyticsLabel", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
