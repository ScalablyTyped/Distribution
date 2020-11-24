package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyCompliance extends js.Object {
  
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
  implicit class PolicyComplianceOps[Self <: PolicyCompliance] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: PolicyTopicEntry*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[PolicyTopicEntry]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
}
