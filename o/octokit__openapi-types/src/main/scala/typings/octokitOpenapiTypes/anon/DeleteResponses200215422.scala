package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses200215422 extends StObject {
  
  /**
    * Remove team access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    */
  var delete: Responses200215422
  
  /**
    * Get teams with access to the protected branch
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  var get: Responses200215
  
  /**
    * Add team access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    */
  var post: Responses200215422
  
  /**
    * Set team access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    */
  var put: Responses200215422
}
object DeleteResponses200215422 {
  
  inline def apply(
    delete: Responses200215422,
    get: Responses200215,
    post: Responses200215422,
    put: Responses200215422
  ): DeleteResponses200215422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses200215422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses200215422] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses200215422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200215): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200215422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200215422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
