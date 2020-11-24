package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainCallEvidence extends js.Object {
  
  /** Breakdown of the most frequent domains called via HTTP by the creative. */
  var topHttpCallDomains: js.UndefOr[js.Array[DomainCalls]] = js.native
  
  /** The total number of HTTP calls made by the creative, including but not limited to the number of calls in the top_http_call_domains. */
  var totalHttpCallCount: js.UndefOr[Double] = js.native
}
object DomainCallEvidence {
  
  @scala.inline
  def apply(): DomainCallEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainCallEvidence]
  }
  
  @scala.inline
  implicit class DomainCallEvidenceOps[Self <: DomainCallEvidence] (val x: Self) extends AnyVal {
    
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
    def setTopHttpCallDomainsVarargs(value: DomainCalls*): Self = this.set("topHttpCallDomains", js.Array(value :_*))
    
    @scala.inline
    def setTopHttpCallDomains(value: js.Array[DomainCalls]): Self = this.set("topHttpCallDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopHttpCallDomains: Self = this.set("topHttpCallDomains", js.undefined)
    
    @scala.inline
    def setTotalHttpCallCount(value: Double): Self = this.set("totalHttpCallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalHttpCallCount: Self = this.set("totalHttpCallCount", js.undefined)
  }
}
