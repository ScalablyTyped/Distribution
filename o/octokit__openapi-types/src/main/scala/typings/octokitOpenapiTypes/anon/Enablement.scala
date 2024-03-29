package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enablement extends StObject {
  
  var enablement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-security-product-enablement'] */ js.Any
  
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  var security_product: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['security-product'] */ js.Any
}
object Enablement {
  
  inline def apply(
    enablement: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-security-product-enablement'] */ js.Any,
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    security_product: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['security-product'] */ js.Any
  ): Enablement = {
    val __obj = js.Dynamic.literal(enablement = enablement.asInstanceOf[js.Any], security_product = security_product.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enablement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enablement] (val x: Self) extends AnyVal {
    
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
