package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses200Content80422 extends StObject {
  
  /**
    * Remove user access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a user to push to this branch.
    *
    * | Type    | Description                                                                                                                                   |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var delete: Responses200Content80422
  
  /**
    * Get users with access to the protected branch
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  var get: Responses200Content80404
  
  /**
    * Add user access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var post: Responses200Content80422
  
  /**
    * Set user access restrictions
    * @description Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  var put: Responses200Content80422
}
object DeleteResponses200Content80422 {
  
  inline def apply(
    delete: Responses200Content80422,
    get: Responses200Content80404,
    post: Responses200Content80422,
    put: Responses200Content80422
  ): DeleteResponses200Content80422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses200Content80422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses200Content80422] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses200Content80422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content80404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200Content80422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content80422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
