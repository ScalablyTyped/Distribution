package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFindingStateRequest extends StObject {
  
  /** Required. The time at which the updated state takes effect. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Required. The desired State of the finding. */
  var state: js.UndefOr[String] = js.undefined
}
object SetFindingStateRequest {
  
  inline def apply(): SetFindingStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetFindingStateRequest]
  }
  
  extension [Self <: SetFindingStateRequest](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
