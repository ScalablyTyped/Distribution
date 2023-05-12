package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathKeyidOwnerResponses extends StObject {
  
  /**
    * Delete a deploy key
    * @description Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.
    */
  var delete: ParametersPathKeyidOwnerResponses
  
  /** Get a deploy key */
  var get: ParametersPathKeyidOwner
}
object DeleteParametersPathKeyidOwnerResponses {
  
  inline def apply(delete: ParametersPathKeyidOwnerResponses, get: ParametersPathKeyidOwner): DeleteParametersPathKeyidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathKeyidOwnerResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathKeyidOwnerResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathKeyidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathKeyidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
