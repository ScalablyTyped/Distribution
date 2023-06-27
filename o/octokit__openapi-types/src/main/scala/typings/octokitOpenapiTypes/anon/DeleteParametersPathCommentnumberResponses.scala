package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentnumberResponses extends StObject {
  
  /**
    * Delete a discussion comment
    * @description Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.
    */
  var delete: ParametersPathCommentnumberResponses
  
  /**
    * Get a discussion comment
    * @description Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.
    */
  var get: ParametersPathCommentnumber
  
  /**
    * Update a discussion comment
    * @description Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.
    */
  var patch: Responses200Content137
}
object DeleteParametersPathCommentnumberResponses {
  
  inline def apply(
    delete: ParametersPathCommentnumberResponses,
    get: ParametersPathCommentnumber,
    patch: Responses200Content137
  ): DeleteParametersPathCommentnumberResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentnumberResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCommentnumberResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentnumberResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentnumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content137): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
