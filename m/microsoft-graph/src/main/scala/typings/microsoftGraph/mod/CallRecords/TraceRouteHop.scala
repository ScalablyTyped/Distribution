package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceRouteHop extends StObject {
  
  // The network path count of this hop that was used to compute the RTT.
  var hopCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // IP address used for this hop in the network trace.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO
    * 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator,
    * and S is the second designator.
    */
  var roundTripTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object TraceRouteHop {
  
  inline def apply(): TraceRouteHop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceRouteHop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceRouteHop] (val x: Self) extends AnyVal {
    
    inline def setHopCount(value: NullableOption[Double]): Self = StObject.set(x, "hopCount", value.asInstanceOf[js.Any])
    
    inline def setHopCountNull: Self = StObject.set(x, "hopCount", null)
    
    inline def setHopCountUndefined: Self = StObject.set(x, "hopCount", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setRoundTripTime(value: NullableOption[String]): Self = StObject.set(x, "roundTripTime", value.asInstanceOf[js.Any])
    
    inline def setRoundTripTimeNull: Self = StObject.set(x, "roundTripTime", null)
    
    inline def setRoundTripTimeUndefined: Self = StObject.set(x, "roundTripTime", js.undefined)
  }
}
