package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters438 extends StObject {
  
  /**
    * List reactions for a team discussion (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: Parameters438
  
  /**
    * Create reaction for a team discussion (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.
    */
  var post: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139
}
object GetParameters438 {
  
  inline def apply(get: Parameters438, post: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139): GetParameters438 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters438]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters438] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters438): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
