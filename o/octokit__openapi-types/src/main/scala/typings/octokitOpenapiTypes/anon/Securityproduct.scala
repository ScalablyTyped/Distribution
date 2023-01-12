package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.advanced_security
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependabot_alerts
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependabot_security_updates
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependency_graph
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disable_all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enable_all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret_scanning
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret_scanning_push_protection
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
  var enablement: enable_all | disable_all
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The security feature to enable or disable. */
  var security_product: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection
}
object Securityproduct {
  
  inline def apply(
    enablement: enable_all | disable_all,
    org_ : String,
    security_product: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection
  ): Securityproduct = {
    val __obj = js.Dynamic.literal(enablement = enablement.asInstanceOf[js.Any], security_product = security_product.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Securityproduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Securityproduct] (val x: Self) extends AnyVal {
    
    inline def setEnablement(value: enable_all | disable_all): Self = StObject.set(x, "enablement", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setSecurity_product(
      value: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection
    ): Self = StObject.set(x, "security_product", value.asInstanceOf[js.Any])
  }
}
