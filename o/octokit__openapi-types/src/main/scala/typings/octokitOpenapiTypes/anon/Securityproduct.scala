package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Securityproduct extends StObject {
  
  /**
    * The action to take.
    *
    * `enable_all` means to enable the specified security feature for all repositories in the organization.
    * `disable_all` means to disable the specified security feature for all repositories in the organization.
    */
  var enablement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-security-product-enablement'] */ js.Any
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  /** The security feature to enable or disable. */
  var security_product: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['security-product'] */ js.Any
}
object Securityproduct {
  
  inline def apply(
    enablement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-security-product-enablement'] */ js.Any,
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    security_product: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['security-product'] */ js.Any
  ): Securityproduct = {
    val __obj = js.Dynamic.literal(enablement = enablement.asInstanceOf[js.Any], security_product = security_product.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Securityproduct]
  }
  
  extension [Self <: Securityproduct](x: Self) {
    
    inline def setEnablement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-security-product-enablement'] */ js.Any
    ): Self = StObject.set(x, "enablement", value.asInstanceOf[js.Any])
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setSecurity_product(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['security-product'] */ js.Any
    ): Self = StObject.set(x, "security_product", value.asInstanceOf[js.Any])
  }
}
