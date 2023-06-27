package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters141 extends StObject {
  
  /**
    * List reactions for a team discussion
    * @description List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  var get: Parameters141
  
  /**
    * Create reaction for a team discussion
    * @description Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  var post: Responses200Content140
}
object GetParameters141 {
  
  inline def apply(get: Parameters141, post: Responses200Content140): GetParameters141 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters141]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters141] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters141): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content140): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
