package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathLanguageOwner extends StObject {
  
  var parameters: PathLanguageOwner
  
  var responses: `302403`
}
object ParametersPathLanguageOwner {
  
  inline def apply(parameters: PathLanguageOwner, responses: `302403`): ParametersPathLanguageOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathLanguageOwner]
  }
  
  extension [Self <: ParametersPathLanguageOwner](x: Self) {
    
    inline def setParameters(value: PathLanguageOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `302403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
