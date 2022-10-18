package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAutolinkidOwnerResponses236 extends StObject {
  
  /**
    * This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var delete: ParametersPathAutolinkidOwnerResponses236
  
  /**
    * This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersPathAutolinkidOwner
}
object DeleteParametersPathAutolinkidOwnerResponses236 {
  
  inline def apply(delete: ParametersPathAutolinkidOwnerResponses236, get: ParametersPathAutolinkidOwner): DeleteParametersPathAutolinkidOwnerResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAutolinkidOwnerResponses236]
  }
  
  extension [Self <: DeleteParametersPathAutolinkidOwnerResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathAutolinkidOwnerResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAutolinkidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
