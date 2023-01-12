package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathLanguage extends StObject {
  
  var parameters: PathLanguage
  
  var responses: `302`
}
object ParametersPathLanguage {
  
  inline def apply(parameters: PathLanguage, responses: `302`): ParametersPathLanguage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathLanguage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathLanguage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `302`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
