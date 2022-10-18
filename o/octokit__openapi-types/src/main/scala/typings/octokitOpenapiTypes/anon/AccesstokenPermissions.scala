package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccesstokenPermissions extends StObject {
  
  /**
    * @description The OAuth access token used to authenticate to the GitHub API.
    * @example e72e16c7e42f292c6912e7710c838347ae178b4a
    */
  var access_token: String
  
  var permissions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
  ] = js.undefined
  
  /** @description The list of repository names to scope the user-to-server access token to. `repositories` may not be specified if `repository_ids` is specified. */
  var repositories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description The list of repository IDs to scope the user-to-server access token to. `repository_ids` may not be specified if `repositories` is specified.
    * @example [
    *   1
    * ]
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @description The name of the user or organization to scope the user-to-server access token to. **Required** unless `target_id` is specified.
    * @example octocat
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * @description The ID of the user or organization to scope the user-to-server access token to. **Required** unless `target` is specified.
    * @example 1
    */
  var target_id: js.UndefOr[Double] = js.undefined
}
object AccesstokenPermissions {
  
  inline def apply(access_token: String): AccesstokenPermissions = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccesstokenPermissions]
  }
  
  extension [Self <: AccesstokenPermissions](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setPermissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
    ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_ids(value: js.Array[Double]): Self = StObject.set(x, "repository_ids", value.asInstanceOf[js.Any])
    
    inline def setRepository_idsUndefined: Self = StObject.set(x, "repository_ids", js.undefined)
    
    inline def setRepository_idsVarargs(value: Double*): Self = StObject.set(x, "repository_ids", js.Array(value*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTarget_id(value: Double): Self = StObject.set(x, "target_id", value.asInstanceOf[js.Any])
    
    inline def setTarget_idUndefined: Self = StObject.set(x, "target_id", js.undefined)
  }
}
