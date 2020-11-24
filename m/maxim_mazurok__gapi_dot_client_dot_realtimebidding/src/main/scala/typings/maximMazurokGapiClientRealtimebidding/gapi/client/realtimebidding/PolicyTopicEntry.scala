package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTopicEntry extends js.Object {
  
  /** Pieces of evidence associated with this policy topic entry. */
  var evidences: js.UndefOr[js.Array[PolicyTopicEvidence]] = js.native
  
  /** URL of the help center article describing this policy topic. */
  var helpCenterUrl: js.UndefOr[String] = js.native
  
  /**
    * Policy topic this entry refers to. For example, "ALCOHOL", "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible policy topics is not fixed for a particular API
    * version and may change at any time. Can be used to filter the response of the creatives.list method
    */
  var policyTopic: js.UndefOr[String] = js.native
}
object PolicyTopicEntry {
  
  @scala.inline
  def apply(): PolicyTopicEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTopicEntry]
  }
  
  @scala.inline
  implicit class PolicyTopicEntryOps[Self <: PolicyTopicEntry] (val x: Self) extends AnyVal {
    
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
    def setEvidencesVarargs(value: PolicyTopicEvidence*): Self = this.set("evidences", js.Array(value :_*))
    
    @scala.inline
    def setEvidences(value: js.Array[PolicyTopicEvidence]): Self = this.set("evidences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvidences: Self = this.set("evidences", js.undefined)
    
    @scala.inline
    def setHelpCenterUrl(value: String): Self = this.set("helpCenterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpCenterUrl: Self = this.set("helpCenterUrl", js.undefined)
    
    @scala.inline
    def setPolicyTopic(value: String): Self = this.set("policyTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTopic: Self = this.set("policyTopic", js.undefined)
  }
}
