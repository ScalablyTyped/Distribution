package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReachabilityDetails extends js.Object {
  
  /** The details of a failure or a cancellation of reachability analysis. */
  var error: js.UndefOr[Status] = js.native
  
  /** The overall reachability result of the test. */
  var result: js.UndefOr[String] = js.native
  
  /** Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends. */
  var traces: js.UndefOr[js.Array[Trace]] = js.native
  
  /** The time the reachability state was verified. */
  var verifyTime: js.UndefOr[String] = js.native
}
object ReachabilityDetails {
  
  @scala.inline
  def apply(): ReachabilityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachabilityDetails]
  }
  
  @scala.inline
  implicit class ReachabilityDetailsOps[Self <: ReachabilityDetails] (val x: Self) extends AnyVal {
    
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
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setTracesVarargs(value: Trace*): Self = this.set("traces", js.Array(value :_*))
    
    @scala.inline
    def setTraces(value: js.Array[Trace]): Self = this.set("traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraces: Self = this.set("traces", js.undefined)
    
    @scala.inline
    def setVerifyTime(value: String): Self = this.set("verifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyTime: Self = this.set("verifyTime", js.undefined)
  }
}
