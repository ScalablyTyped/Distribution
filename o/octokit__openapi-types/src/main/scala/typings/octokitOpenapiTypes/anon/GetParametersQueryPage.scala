package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPage extends StObject {
  
  /**
    * Lists the organizations that are selected to have GitHub Actions enabled in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: ParametersQueryPage
  
  /**
    * Replaces the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonSelectedorganizationids
}
object GetParametersQueryPage {
  
  inline def apply(get: ParametersQueryPage, put: RequestBodyContentApplicationjsonSelectedorganizationids): GetParametersQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
