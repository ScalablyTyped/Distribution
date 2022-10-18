package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath608Responses extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Delete a discussion`](https://docs.github.com/rest/reference/teams#delete-a-discussion) endpoint.
    *
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var delete: ParametersPath608Responses
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion](https://docs.github.com/rest/reference/teams#get-a-discussion) endpoint.
    *
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPath608
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion](https://docs.github.com/rest/reference/teams#update-a-discussion) endpoint.
    *
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var patch: ParametersPath608RequestBodyContentApplicationjsonBodyTitle
}
object DeleteParametersPath608Responses {
  
  inline def apply(
    delete: ParametersPath608Responses,
    get: ParametersPath608,
    patch: ParametersPath608RequestBodyContentApplicationjsonBodyTitle
  ): DeleteParametersPath608Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath608Responses]
  }
  
  extension [Self <: DeleteParametersPath608Responses](x: Self) {
    
    inline def setDelete(value: ParametersPath608Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath608): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath608RequestBodyContentApplicationjsonBodyTitle): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
