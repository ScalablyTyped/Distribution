package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathGhsaid extends StObject {
  
  /**
    * Get a repository security advisory
    * @description Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
    * You can access any published security advisory on a public repository.
    * You must authenticate using an access token with the `repo` scope or `repository_advisories:read` permission
    * in order to get a published security advisory in a private repository, or any unpublished security advisory that you have access to.
    *
    * You can access an unpublished security advisory from a repository if you are a security manager or administrator of that repository, or if you are a
    * collaborator on the security advisory.
    */
  var get: ParametersPathGhsaid
  
  /**
    * Update a repository security advisory
    * @description Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
    * You must authenticate using an access token with the `repo` scope or `repository_advisories:write` permission to use this endpoint.
    *
    * In order to update any security advisory, you must be a security manager or administrator of that repository,
    * or a collaborator on the repository security advisory.
    */
  var patch: RequestBodyContent345
}
object GetParametersPathGhsaid {
  
  inline def apply(get: ParametersPathGhsaid, patch: RequestBodyContent345): GetParametersPathGhsaid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathGhsaid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathGhsaid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathGhsaid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContent345): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
