package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathMilestonenumberResponses6 extends StObject {
  
  var delete: ParametersPathMilestonenumberResponses6
  
  var get: ParametersPathMilestonenumber
  
  var patch: RequestBodyContentApplicationjsonDescriptionDueon
}
object DeleteParametersPathMilestonenumberResponses6 {
  
  inline def apply(
    delete: ParametersPathMilestonenumberResponses6,
    get: ParametersPathMilestonenumber,
    patch: RequestBodyContentApplicationjsonDescriptionDueon
  ): DeleteParametersPathMilestonenumberResponses6 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathMilestonenumberResponses6]
  }
  
  extension [Self <: DeleteParametersPathMilestonenumberResponses6](x: Self) {
    
    inline def setDelete(value: ParametersPathMilestonenumberResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathMilestonenumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonDescriptionDueon): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
