package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content587 extends StObject {
  
  /** This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://docs.github.com/rest/reference/activity#set-a-repository-subscription). */
  var delete: Parameters395Responses
  
  var get: Responses200Content587
  
  /** If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription) completely. */
  var put: Responses588
}
object GetResponses200Content587 {
  
  inline def apply(delete: Parameters395Responses, get: Responses200Content587, put: Responses588): GetResponses200Content587 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content587]
  }
  
  extension [Self <: GetResponses200Content587](x: Self) {
    
    inline def setDelete(value: Parameters395Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content587): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses588): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
