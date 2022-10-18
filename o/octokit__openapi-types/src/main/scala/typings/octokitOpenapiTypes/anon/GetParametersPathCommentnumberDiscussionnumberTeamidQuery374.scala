package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCommentnumberDiscussionnumberTeamidQuery374 extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPathCommentnumberDiscussionnumberTeamidQuery374
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new "[Create reaction for a team discussion comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion-comment)" endpoint.
    *
    * Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.
    */
  var post: Responses609
}
object GetParametersPathCommentnumberDiscussionnumberTeamidQuery374 {
  
  inline def apply(get: ParametersPathCommentnumberDiscussionnumberTeamidQuery374, post: Responses609): GetParametersPathCommentnumberDiscussionnumberTeamidQuery374 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCommentnumberDiscussionnumberTeamidQuery374]
  }
  
  extension [Self <: GetParametersPathCommentnumberDiscussionnumberTeamidQuery374](x: Self) {
    
    inline def setGet(value: ParametersPathCommentnumberDiscussionnumberTeamidQuery374): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses609): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
