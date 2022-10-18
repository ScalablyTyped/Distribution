package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses200Content444422 extends StObject {
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var delete: Responses200Content444422
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  var get: Responses200Content444
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var post: Responses200Content444422
  
  /**
    * Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var put: Responses200Content444422
}
object DeleteResponses200Content444422 {
  
  inline def apply(
    delete: Responses200Content444422,
    get: Responses200Content444,
    post: Responses200Content444422,
    put: Responses200Content444422
  ): DeleteResponses200Content444422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses200Content444422]
  }
  
  extension [Self <: DeleteResponses200Content444422](x: Self) {
    
    inline def setDelete(value: Responses200Content444422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content444): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content444422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content444422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
