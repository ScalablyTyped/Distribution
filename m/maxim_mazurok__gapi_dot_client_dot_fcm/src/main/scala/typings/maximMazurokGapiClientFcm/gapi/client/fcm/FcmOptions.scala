package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FcmOptions extends StObject {
  
  /** Label associated with the message's analytics data. */
  var analyticsLabel: js.UndefOr[String] = js.undefined
}
object FcmOptions {
  
  inline def apply(): FcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FcmOptions]
  }
  
  extension [Self <: FcmOptions](x: Self) {
    
    inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
  }
}
