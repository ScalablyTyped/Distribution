package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditData extends StObject {
  
  /** Policy delta between the original policy and the newly set policy. */
  var policyDelta: js.UndefOr[PolicyDelta] = js.undefined
}
object AuditData {
  
  inline def apply(): AuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditData] (val x: Self) extends AnyVal {
    
    inline def setPolicyDelta(value: PolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
    
    inline def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
  }
}
