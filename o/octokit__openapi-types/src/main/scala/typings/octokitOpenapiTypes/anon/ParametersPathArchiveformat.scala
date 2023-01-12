package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArchiveformat extends StObject {
  
  var parameters: PathArchiveformat
  
  var responses: `138`
}
object ParametersPathArchiveformat {
  
  inline def apply(parameters: PathArchiveformat, responses: `138`): ParametersPathArchiveformat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArchiveformat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathArchiveformat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathArchiveformat): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `138`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
