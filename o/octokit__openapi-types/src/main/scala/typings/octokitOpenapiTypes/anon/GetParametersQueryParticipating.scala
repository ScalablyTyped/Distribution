package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryParticipating extends StObject {
  
  /**
    * List repository notifications for the authenticated user
    * @description Lists all notifications for the current user in the specified repository.
    */
  var get: ParametersQueryParticipating
  
  /**
    * Mark repository notifications as read
    * @description Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.
    */
  var put: Responses202ContentApplicationjsonUrl
}
object GetParametersQueryParticipating {
  
  inline def apply(get: ParametersQueryParticipating, put: Responses202ContentApplicationjsonUrl): GetParametersQueryParticipating = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryParticipating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryParticipating] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryParticipating): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202ContentApplicationjsonUrl): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
