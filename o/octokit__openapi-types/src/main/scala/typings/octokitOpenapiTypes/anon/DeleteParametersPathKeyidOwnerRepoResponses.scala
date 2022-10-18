package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathKeyidOwnerRepoResponses extends StObject {
  
  /** Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead. */
  var delete: ParametersPathKeyidOwnerRepoResponses
  
  var get: ParametersPathKeyidOwnerRepo
}
object DeleteParametersPathKeyidOwnerRepoResponses {
  
  inline def apply(delete: ParametersPathKeyidOwnerRepoResponses, get: ParametersPathKeyidOwnerRepo): DeleteParametersPathKeyidOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathKeyidOwnerRepoResponses]
  }
  
  extension [Self <: DeleteParametersPathKeyidOwnerRepoResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathKeyidOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathKeyidOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
