package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPageParticipating extends StObject {
  
  /** List all notifications for the current user. */
  var get: ParametersQueryPageParticipating
  
  /** Marks all notifications in a repository as "read" removes them from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`. */
  var put: Responses202205
}
object GetParametersQueryPageParticipating {
  
  inline def apply(get: ParametersQueryPageParticipating, put: Responses202205): GetParametersQueryPageParticipating = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPageParticipating]
  }
  
  extension [Self <: GetParametersQueryPageParticipating](x: Self) {
    
    inline def setGet(value: ParametersQueryPageParticipating): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202205): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
