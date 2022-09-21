package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentnumberDiscussionnumberResponses extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a discussion comment](https://docs.github.com/rest/reference/teams#delete-a-discussion-comment) endpoint.
    *
    * Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var delete: ParametersPathCommentnumberDiscussionnumberResponses
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion comment](https://docs.github.com/rest/reference/teams#get-a-discussion-comment) endpoint.
    *
    * Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPathCommentnumberDiscussionnumber
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion comment](https://docs.github.com/rest/reference/teams#update-a-discussion-comment) endpoint.
    *
    * Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var patch: ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody
}
object DeleteParametersPathCommentnumberDiscussionnumberResponses {
  
  inline def apply(
    delete: ParametersPathCommentnumberDiscussionnumberResponses,
    get: ParametersPathCommentnumberDiscussionnumber,
    patch: ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody
  ): DeleteParametersPathCommentnumberDiscussionnumberResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentnumberDiscussionnumberResponses]
  }
  
  extension [Self <: DeleteParametersPathCommentnumberDiscussionnumberResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentnumberDiscussionnumberResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentnumberDiscussionnumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
