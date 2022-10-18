package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePut extends StObject {
  
  /**
    * Removes an organization from the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPath251
  
  /**
    * Adds an organization to the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var put: ParametersPath251
}
object DeletePut {
  
  inline def apply(delete: ParametersPath251, put: ParametersPath251): DeletePut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePut]
  }
  
  extension [Self <: DeletePut](x: Self) {
    
    inline def setDelete(value: ParametersPath251): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath251): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
