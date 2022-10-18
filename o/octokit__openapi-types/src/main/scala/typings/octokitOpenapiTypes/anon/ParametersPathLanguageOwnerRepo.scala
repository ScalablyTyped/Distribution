package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathLanguageOwnerRepo extends StObject {
  
  var parameters: PathLanguageOwnerRepo
  
  var responses: `302403`
}
object ParametersPathLanguageOwnerRepo {
  
  inline def apply(parameters: PathLanguageOwnerRepo, responses: `302403`): ParametersPathLanguageOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathLanguageOwnerRepo]
  }
  
  extension [Self <: ParametersPathLanguageOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathLanguageOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `302403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
