package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAutolinkidResponses6 extends StObject {
  
  /**
    * This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var delete: ParametersPathAutolinkidResponses6
  
  /**
    * This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersPathAutolinkid
}
object DeleteParametersPathAutolinkidResponses6 {
  
  inline def apply(delete: ParametersPathAutolinkidResponses6, get: ParametersPathAutolinkid): DeleteParametersPathAutolinkidResponses6 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAutolinkidResponses6]
  }
  
  extension [Self <: DeleteParametersPathAutolinkidResponses6](x: Self) {
    
    inline def setDelete(value: ParametersPathAutolinkidResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAutolinkid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
