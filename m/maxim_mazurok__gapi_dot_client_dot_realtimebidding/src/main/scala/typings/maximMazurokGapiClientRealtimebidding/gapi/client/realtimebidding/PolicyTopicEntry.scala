package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTopicEntry extends StObject {
  
  /** Pieces of evidence associated with this policy topic entry. */
  var evidences: js.UndefOr[js.Array[PolicyTopicEvidence]] = js.undefined
  
  /** URL of the help center article describing this policy topic. */
  var helpCenterUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Policy topic this entry refers to. For example, "ALCOHOL", "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible policy topics is not fixed for a particular API
    * version and may change at any time. Can be used to filter the response of the creatives.list method
    */
  var policyTopic: js.UndefOr[String] = js.undefined
}
object PolicyTopicEntry {
  
  inline def apply(): PolicyTopicEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTopicEntry]
  }
  
  extension [Self <: PolicyTopicEntry](x: Self) {
    
    inline def setEvidences(value: js.Array[PolicyTopicEvidence]): Self = StObject.set(x, "evidences", value.asInstanceOf[js.Any])
    
    inline def setEvidencesUndefined: Self = StObject.set(x, "evidences", js.undefined)
    
    inline def setEvidencesVarargs(value: PolicyTopicEvidence*): Self = StObject.set(x, "evidences", js.Array(value :_*))
    
    inline def setHelpCenterUrl(value: String): Self = StObject.set(x, "helpCenterUrl", value.asInstanceOf[js.Any])
    
    inline def setHelpCenterUrlUndefined: Self = StObject.set(x, "helpCenterUrl", js.undefined)
    
    inline def setPolicyTopic(value: String): Self = StObject.set(x, "policyTopic", value.asInstanceOf[js.Any])
    
    inline def setPolicyTopicUndefined: Self = StObject.set(x, "policyTopic", js.undefined)
  }
}
