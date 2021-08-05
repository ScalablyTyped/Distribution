package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportStateAndNotificationResponse extends StObject {
  
  /** Request ID copied from ReportStateAndNotificationRequest. */
  var requestId: js.UndefOr[String] = js.undefined
}
object ReportStateAndNotificationResponse {
  
  inline def apply(): ReportStateAndNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStateAndNotificationResponse]
  }
  
  extension [Self <: ReportStateAndNotificationResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
