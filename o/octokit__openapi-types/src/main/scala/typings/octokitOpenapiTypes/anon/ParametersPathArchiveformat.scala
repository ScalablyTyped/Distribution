package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArchiveformat extends StObject {
  
  var parameters: PathArchiveformat
  
  var responses: `147`
}
object ParametersPathArchiveformat {
  
  inline def apply(parameters: PathArchiveformat, responses: `147`): ParametersPathArchiveformat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArchiveformat]
  }
  
  extension [Self <: ParametersPathArchiveformat](x: Self) {
    
    inline def setParameters(value: PathArchiveformat): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `147`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
