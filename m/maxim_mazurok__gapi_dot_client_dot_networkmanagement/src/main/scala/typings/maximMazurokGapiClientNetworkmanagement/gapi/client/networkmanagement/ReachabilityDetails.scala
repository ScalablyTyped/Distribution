package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReachabilityDetails extends StObject {
  
  /** The details of a failure or a cancellation of reachability analysis. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** The overall reachability result of the test. */
  var result: js.UndefOr[String] = js.undefined
  
  /** Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends. */
  var traces: js.UndefOr[js.Array[Trace]] = js.undefined
  
  /** The time the reachability state was verified. */
  var verifyTime: js.UndefOr[String] = js.undefined
}
object ReachabilityDetails {
  
  inline def apply(): ReachabilityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachabilityDetails]
  }
  
  extension [Self <: ReachabilityDetails](x: Self) {
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setTraces(value: js.Array[Trace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
    
    inline def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
    
    inline def setTracesVarargs(value: Trace*): Self = StObject.set(x, "traces", js.Array(value :_*))
    
    inline def setVerifyTime(value: String): Self = StObject.set(x, "verifyTime", value.asInstanceOf[js.Any])
    
    inline def setVerifyTimeUndefined: Self = StObject.set(x, "verifyTime", js.undefined)
  }
}
