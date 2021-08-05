package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetGithubPackagesBillingGheEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
}
object EnterpriseAdminGetGithubPackagesBillingGheEndpoint {
  
  inline def apply(enterprise: String): EnterpriseAdminGetGithubPackagesBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetGithubPackagesBillingGheEndpoint]
  }
  
  extension [Self <: EnterpriseAdminGetGithubPackagesBillingGheEndpoint](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}
