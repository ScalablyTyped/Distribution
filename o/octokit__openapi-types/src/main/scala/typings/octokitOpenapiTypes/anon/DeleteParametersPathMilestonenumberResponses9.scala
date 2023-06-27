package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathMilestonenumberResponses9 extends StObject {
  
  /**
    * Delete a milestone
    * @description Deletes a milestone using the given milestone number.
    */
  var delete: ParametersPathMilestonenumberResponses9
  
  /**
    * Get a milestone
    * @description Gets a milestone using the given milestone number.
    */
  var get: ParametersPathMilestonenumber
  
  /** Update a milestone */
  var patch: Responses353
}
object DeleteParametersPathMilestonenumberResponses9 {
  
  inline def apply(
    delete: ParametersPathMilestonenumberResponses9,
    get: ParametersPathMilestonenumber,
    patch: Responses353
  ): DeleteParametersPathMilestonenumberResponses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathMilestonenumberResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathMilestonenumberResponses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathMilestonenumberResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathMilestonenumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses353): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
