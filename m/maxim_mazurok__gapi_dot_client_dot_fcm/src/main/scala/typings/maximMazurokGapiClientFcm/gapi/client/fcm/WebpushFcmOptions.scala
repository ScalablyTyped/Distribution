package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpushFcmOptions extends StObject {
  
  /** Label associated with the message's analytics data. */
  var analyticsLabel: js.UndefOr[String] = js.native
  
  /** The link to open when the user clicks on the notification. For all URL values, HTTPS is required. */
  var link: js.UndefOr[String] = js.native
}
object WebpushFcmOptions {
  
  @scala.inline
  def apply(): WebpushFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushFcmOptions]
  }
  
  @scala.inline
  implicit class WebpushFcmOptionsMutableBuilder[Self <: WebpushFcmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
