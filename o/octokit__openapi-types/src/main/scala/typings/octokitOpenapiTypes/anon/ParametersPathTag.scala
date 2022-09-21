package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTag extends StObject {
  
  var parameters: PathTag
  
  var responses: `200323404`
}
object ParametersPathTag {
  
  inline def apply(parameters: PathTag, responses: `200323404`): ParametersPathTag = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTag]
  }
  
  extension [Self <: ParametersPathTag](x: Self) {
    
    inline def setParameters(value: PathTag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200323404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
