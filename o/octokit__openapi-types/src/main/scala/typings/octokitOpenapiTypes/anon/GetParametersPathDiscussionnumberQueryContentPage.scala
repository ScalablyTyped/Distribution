package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDiscussionnumberQueryContentPage extends StObject {
  
  /**
    * List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  var get: ParametersPathDiscussionnumberQueryContentPage
  
  /**
    * Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  var post: Responses200Content120
}
object GetParametersPathDiscussionnumberQueryContentPage {
  
  inline def apply(get: ParametersPathDiscussionnumberQueryContentPage, post: Responses200Content120): GetParametersPathDiscussionnumberQueryContentPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDiscussionnumberQueryContentPage]
  }
  
  extension [Self <: GetParametersPathDiscussionnumberQueryContentPage](x: Self) {
    
    inline def setGet(value: ParametersPathDiscussionnumberQueryContentPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content120): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
