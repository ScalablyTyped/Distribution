package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainCallEvidence extends StObject {
  
  /** Breakdown of the most frequent domains called via HTTP by the creative. */
  var topHttpCallDomains: js.UndefOr[js.Array[DomainCalls]] = js.undefined
  
  /** The total number of HTTP calls made by the creative, including but not limited to the number of calls in the top_http_call_domains. */
  var totalHttpCallCount: js.UndefOr[Double] = js.undefined
}
object DomainCallEvidence {
  
  @scala.inline
  def apply(): DomainCallEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainCallEvidence]
  }
  
  @scala.inline
  implicit class DomainCallEvidenceMutableBuilder[Self <: DomainCallEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopHttpCallDomains(value: js.Array[DomainCalls]): Self = StObject.set(x, "topHttpCallDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopHttpCallDomainsUndefined: Self = StObject.set(x, "topHttpCallDomains", js.undefined)
    
    @scala.inline
    def setTopHttpCallDomainsVarargs(value: DomainCalls*): Self = StObject.set(x, "topHttpCallDomains", js.Array(value :_*))
    
    @scala.inline
    def setTotalHttpCallCount(value: Double): Self = StObject.set(x, "totalHttpCallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHttpCallCountUndefined: Self = StObject.set(x, "totalHttpCallCount", js.undefined)
  }
}
