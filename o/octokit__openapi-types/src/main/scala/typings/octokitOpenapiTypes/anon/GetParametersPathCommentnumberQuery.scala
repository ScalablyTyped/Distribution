package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommentnumberQuery extends StObject {
  
  /**
    * List reactions for a team discussion comment
    * @description List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments/). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  var get: ParametersPathCommentnumberQuery
  
  /**
    * Create reaction for a team discussion comment
    * @description Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  var post: RequestBodyContentApplicationjson139
}
object GetParametersPathCommentnumberQuery {
  
  inline def apply(get: ParametersPathCommentnumberQuery, post: RequestBodyContentApplicationjson139): GetParametersPathCommentnumberQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommentnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathCommentnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathCommentnumberQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjson139): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
