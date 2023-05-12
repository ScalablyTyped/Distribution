package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAutolinkidResponses7 extends StObject {
  
  /**
    * Delete an autolink reference from a repository
    * @description This deletes a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var delete: ParametersPathAutolinkidResponses7
  
  /**
    * Get an autolink reference of a repository
    * @description This returns a single autolink reference by ID that was configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersPathAutolinkid
}
object DeleteParametersPathAutolinkidResponses7 {
  
  inline def apply(delete: ParametersPathAutolinkidResponses7, get: ParametersPathAutolinkid): DeleteParametersPathAutolinkidResponses7 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAutolinkidResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathAutolinkidResponses7] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathAutolinkidResponses7): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAutolinkid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
