package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsFcmOptions extends StObject {
  
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
  implicit class ApnsFcmOptionsMutableBuilder[Self <: ApnsFcmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
