package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCreatedatDeploymentbranchpolicy
  
  /** Validation error when the environment name is invalid or when `protected_branches` and `custom_branch_policies` in `deployment_branch_policy` are set to the same value */
  var `422`: ContentApplicationjsonDocumentationurlMessage
}
object `422ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(
    `200`: ContentApplicationjsonCreatedatDeploymentbranchpolicy,
    `422`: ContentApplicationjsonDocumentationurlMessage
  ): `422ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422ContentApplicationjsonDocumentationurlMessage`]
  }
  
  extension [Self <: `422ContentApplicationjsonDocumentationurlMessage`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCreatedatDeploymentbranchpolicy): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
