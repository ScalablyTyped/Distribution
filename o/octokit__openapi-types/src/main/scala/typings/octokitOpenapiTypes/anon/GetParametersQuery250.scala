package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery250 extends StObject {
  
  /**
    * Lists the organizations that are selected to have GitHub Actions enabled in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: ParametersQuery250
  
  /**
    * Replaces the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var put: ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids
}
object GetParametersQuery250 {
  
  inline def apply(
    get: ParametersQuery250,
    put: ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids
  ): GetParametersQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery250]
  }
  
  extension [Self <: GetParametersQuery250](x: Self) {
    
    inline def setGet(value: ParametersQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath246RequestBodyContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
