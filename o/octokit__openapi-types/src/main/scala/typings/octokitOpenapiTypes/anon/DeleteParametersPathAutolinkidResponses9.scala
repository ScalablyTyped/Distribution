package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAutolinkidResponses9 extends StObject {
  
  /**
    * Delete an autolink reference from a repository
    * @description This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var delete: ParametersPathAutolinkidResponses9
  
  /**
    * Get an autolink reference of a repository
    * @description This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersPathAutolinkid
}
object DeleteParametersPathAutolinkidResponses9 {
  
  inline def apply(delete: ParametersPathAutolinkidResponses9, get: ParametersPathAutolinkid): DeleteParametersPathAutolinkidResponses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAutolinkidResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathAutolinkidResponses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathAutolinkidResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAutolinkid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
