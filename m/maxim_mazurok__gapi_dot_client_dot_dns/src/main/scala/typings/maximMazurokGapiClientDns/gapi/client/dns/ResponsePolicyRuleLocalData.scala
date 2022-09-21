package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePolicyRuleLocalData extends StObject {
  
  /** All resource record sets for this selector, one per resource record type. The name must match the dns_name. */
  var localDatas: js.UndefOr[js.Array[ResourceRecordSet]] = js.undefined
}
object ResponsePolicyRuleLocalData {
  
  inline def apply(): ResponsePolicyRuleLocalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePolicyRuleLocalData]
  }
  
  extension [Self <: ResponsePolicyRuleLocalData](x: Self) {
    
    inline def setLocalDatas(value: js.Array[ResourceRecordSet]): Self = StObject.set(x, "localDatas", value.asInstanceOf[js.Any])
    
    inline def setLocalDatasUndefined: Self = StObject.set(x, "localDatas", js.undefined)
    
    inline def setLocalDatasVarargs(value: ResourceRecordSet*): Self = StObject.set(x, "localDatas", js.Array(value*))
  }
}
