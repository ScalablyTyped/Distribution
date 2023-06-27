package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters355 extends StObject {
  
  /**
    * List repository notifications for the authenticated user
    * @description Lists all notifications for the current user in the specified repository.
    */
  var get: Parameters355
  
  /**
    * Mark repository notifications as read
    * @description Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  var put: Responses202ContentApplicationjsonUrl
}
object GetParameters355 {
  
  inline def apply(get: Parameters355, put: Responses202ContentApplicationjsonUrl): GetParameters355 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters355]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters355] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters355): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202ContentApplicationjsonUrl): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
