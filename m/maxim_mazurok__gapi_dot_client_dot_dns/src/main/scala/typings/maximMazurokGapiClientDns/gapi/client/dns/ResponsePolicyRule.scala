package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePolicyRule extends StObject {
  
  /** Answer this query with a behavior rather than DNS data. */
  var behavior: js.UndefOr[String] = js.undefined
  
  /** The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule. */
  var dnsName: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public
    * internet, and GCP internal DNS. No SOA nor NS types are allowed.
    */
  var localData: js.UndefOr[ResponsePolicyRuleLocalData] = js.undefined
  
  /** An identifier for this rule. Must be unique with the ResponsePolicy. */
  var ruleName: js.UndefOr[String] = js.undefined
}
object ResponsePolicyRule {
  
  inline def apply(): ResponsePolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePolicyRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePolicyRule] (val x: Self) extends AnyVal {
    
    inline def setBehavior(value: String): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalData(value: ResponsePolicyRuleLocalData): Self = StObject.set(x, "localData", value.asInstanceOf[js.Any])
    
    inline def setLocalDataUndefined: Self = StObject.set(x, "localData", js.undefined)
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
  }
}
