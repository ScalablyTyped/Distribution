package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathMilestonenumberResponses7 extends StObject {
  
  /** Delete a milestone */
  var delete: ParametersPathMilestonenumberResponses7
  
  /** Get a milestone */
  var get: ParametersPathMilestonenumber
  
  /** Update a milestone */
  var patch: Responses299
}
object DeleteParametersPathMilestonenumberResponses7 {
  
  inline def apply(
    delete: ParametersPathMilestonenumberResponses7,
    get: ParametersPathMilestonenumber,
    patch: Responses299
  ): DeleteParametersPathMilestonenumberResponses7 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathMilestonenumberResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathMilestonenumberResponses7] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathMilestonenumberResponses7): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathMilestonenumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses299): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
