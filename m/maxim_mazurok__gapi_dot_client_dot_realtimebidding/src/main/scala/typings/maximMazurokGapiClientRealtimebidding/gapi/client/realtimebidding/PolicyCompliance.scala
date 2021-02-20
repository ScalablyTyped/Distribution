package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyCompliance extends StObject {
  
  /** Serving status for the given transaction type (e.g., open auction, deals) or region (e.g., China, Russia). Can be used to filter the response of the creatives.list method. */
  var status: js.UndefOr[String] = js.native
  
  /** Topics related to the policy compliance for this transaction type (e.g., open auction, deals) or region (e.g., China, Russia). Topics may be present only if status is DISAPPROVED. */
  var topics: js.UndefOr[js.Array[PolicyTopicEntry]] = js.native
}
object PolicyCompliance {
  
  @scala.inline
  def apply(): PolicyCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyCompliance]
  }
  
  @scala.inline
  implicit class PolicyComplianceMutableBuilder[Self <: PolicyCompliance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[PolicyTopicEntry]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: PolicyTopicEntry*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
