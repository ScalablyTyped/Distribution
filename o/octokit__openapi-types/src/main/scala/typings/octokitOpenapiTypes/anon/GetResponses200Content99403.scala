package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content99403 extends StObject {
  
  /**
    * List teams
    * @description Lists all teams in an organization that are visible to the authenticated user.
    */
  var get: Responses200Content99403
  
  /**
    * Create a team
    * @description To create a team, the authenticated user must be a member or owner of `{org}`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization)."
    *
    * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of `maintainers`. For more information, see "[About teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)".
    */
  var post: RequestBodyContentApplicationjsonMaintainers
}
object GetResponses200Content99403 {
  
  inline def apply(get: Responses200Content99403, post: RequestBodyContentApplicationjsonMaintainers): GetResponses200Content99403 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content99403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content99403] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content99403): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonMaintainers): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
