package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodespacenameExportid extends StObject {
  
  var parameters: PathCodespacenameExportid
  
  var responses: `200ContentApplicationjsonExporturl`
}
object ParametersPathCodespacenameExportid {
  
  inline def apply(parameters: PathCodespacenameExportid, responses: `200ContentApplicationjsonExporturl`): ParametersPathCodespacenameExportid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodespacenameExportid]
  }
  
  extension [Self <: ParametersPathCodespacenameExportid](x: Self) {
    
    inline def setParameters(value: PathCodespacenameExportid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonExporturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
