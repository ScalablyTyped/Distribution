package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
}
object EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint {
  
  inline def apply(enterprise: String): EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint]
  }
  
  extension [Self <: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}
