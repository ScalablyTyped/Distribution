package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery309 extends StObject {
  
  /** Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var get: ParametersQuery309
  
  /** Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var put: Responses404409Unknown
}
object GetParametersQuery309 {
  
  inline def apply(get: ParametersQuery309, put: Responses404409Unknown): GetParametersQuery309 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery309]
  }
  
  extension [Self <: GetParametersQuery309](x: Self) {
    
    inline def setGet(value: ParametersQuery309): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses404409Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
