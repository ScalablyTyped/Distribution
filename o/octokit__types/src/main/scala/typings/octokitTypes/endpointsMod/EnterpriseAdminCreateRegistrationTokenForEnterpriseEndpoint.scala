package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
}
object EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint {
  
  @scala.inline
  def apply(enterprise: String): EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpointMutableBuilder[Self <: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}
