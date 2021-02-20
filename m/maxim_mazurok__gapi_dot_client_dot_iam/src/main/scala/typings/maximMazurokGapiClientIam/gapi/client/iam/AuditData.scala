package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditData extends StObject {
  
  /** Policy delta between the original policy and the newly set policy. */
  var policyDelta: js.UndefOr[PolicyDelta] = js.native
}
object AuditData {
  
  @scala.inline
  def apply(): AuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditData]
  }
  
  @scala.inline
  implicit class AuditDataMutableBuilder[Self <: AuditData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDelta(value: PolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
  }
}
