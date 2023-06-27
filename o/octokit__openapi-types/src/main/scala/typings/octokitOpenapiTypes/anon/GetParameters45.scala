package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters45 extends StObject {
  
  /**
    * List notifications for the authenticated user
    * @description List all notifications for the current user, sorted by most recently updated.
    */
  var get: Parameters45
  
  /**
    * Mark notifications as read
    * @description Marks all notifications as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  var put: Responses202304
}
object GetParameters45 {
  
  inline def apply(get: Parameters45, put: Responses202304): GetParameters45 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters45]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters45] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters45): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202304): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
