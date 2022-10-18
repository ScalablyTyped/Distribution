package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292QueryAfterBefore extends StObject {
  
  var parameters: Path292QueryAfterBefore
  
  var responses: `200Content578`
}
object ParametersPath292QueryAfterBefore {
  
  inline def apply(parameters: Path292QueryAfterBefore, responses: `200Content578`): ParametersPath292QueryAfterBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292QueryAfterBefore]
  }
  
  extension [Self <: ParametersPath292QueryAfterBefore](x: Self) {
    
    inline def setParameters(value: Path292QueryAfterBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content578`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
