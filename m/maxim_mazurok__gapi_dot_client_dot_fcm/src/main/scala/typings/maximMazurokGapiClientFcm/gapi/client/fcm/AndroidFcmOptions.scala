package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidFcmOptions extends StObject {
  
  /** Label associated with the message's analytics data. */
  var analyticsLabel: js.UndefOr[String] = js.native
}
object AndroidFcmOptions {
  
  @scala.inline
  def apply(): AndroidFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidFcmOptions]
  }
  
  @scala.inline
  implicit class AndroidFcmOptionsMutableBuilder[Self <: AndroidFcmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
  }
}
