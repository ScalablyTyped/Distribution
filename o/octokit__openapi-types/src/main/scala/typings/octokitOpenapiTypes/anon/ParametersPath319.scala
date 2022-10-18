package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath319 extends StObject {
  
  var parameters: Path319
  
  var responses: `200Content260`
}
object ParametersPath319 {
  
  inline def apply(parameters: Path319, responses: `200Content260`): ParametersPath319 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath319]
  }
  
  extension [Self <: ParametersPath319](x: Self) {
    
    inline def setParameters(value: Path319): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content260`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
