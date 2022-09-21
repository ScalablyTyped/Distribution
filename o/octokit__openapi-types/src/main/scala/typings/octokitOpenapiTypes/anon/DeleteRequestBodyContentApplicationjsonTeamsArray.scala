package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonTeamsArray extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    *
    * | Type    | Description                                                                                                                                         |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var delete: RequestBodyContentApplicationjsonTeamsArray
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  var get: Responses200180
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var post: RequestBodyContentApplicationjsonTeamsArray
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var put: RequestBodyContentApplicationjsonTeamsArray
}
object DeleteRequestBodyContentApplicationjsonTeamsArray {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonTeamsArray,
    get: Responses200180,
    post: RequestBodyContentApplicationjsonTeamsArray,
    put: RequestBodyContentApplicationjsonTeamsArray
  ): DeleteRequestBodyContentApplicationjsonTeamsArray = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonTeamsArray]
  }
  
  extension [Self <: DeleteRequestBodyContentApplicationjsonTeamsArray](x: Self) {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonTeamsArray): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200180): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonTeamsArray): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonTeamsArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
