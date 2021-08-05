package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    *  @deprecated "enterprise_id" is deprecated. Use "enterprise" instead
    */
  var enterprise_id: js.UndefOr[String] = js.undefined
}
object EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint {
  
  inline def apply(): EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  extension [Self <: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint](x: Self) {
    
    inline def setEnterprise_id(value: String): Self = StObject.set(x, "enterprise_id", value.asInstanceOf[js.Any])
    
    inline def setEnterprise_idUndefined: Self = StObject.set(x, "enterprise_id", js.undefined)
  }
}
