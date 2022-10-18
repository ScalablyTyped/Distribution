package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content341403 extends StObject {
  
  /** Lists all teams in an organization that are visible to the authenticated user. */
  var get: Responses200Content341403
  
  /**
    * To create a team, the authenticated user must be a member or owner of `{org}`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://docs.github.com/en/articles/setting-team-creation-permissions-in-your-organization)."
    *
    * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of `maintainers`. For more information, see "[About teams](https://docs.github.com/en/github/setting-up-and-managing-organizations-and-teams/about-teams)".
    */
  var post: Responses201Content368
}
object GetResponses200Content341403 {
  
  inline def apply(get: Responses200Content341403, post: Responses201Content368): GetResponses200Content341403 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content341403]
  }
  
  extension [Self <: GetResponses200Content341403](x: Self) {
    
    inline def setGet(value: Responses200Content341403): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content368): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
