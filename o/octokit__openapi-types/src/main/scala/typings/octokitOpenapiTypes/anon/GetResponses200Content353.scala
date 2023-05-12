package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content353 extends StObject {
  
  /**
    * Delete a repository subscription
    * @description This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://docs.github.com/rest/reference/activity#set-a-repository-subscription).
    */
  var delete: Parameters141Responses
  
  /** Get a repository subscription */
  var get: Responses200Content353
  
  /**
    * Set a repository subscription
    * @description If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription) completely.
    */
  var put: Responses354
}
object GetResponses200Content353 {
  
  inline def apply(delete: Parameters141Responses, get: Responses200Content353, put: Responses354): GetResponses200Content353 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content353]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content353] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters141Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content353): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses354): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
