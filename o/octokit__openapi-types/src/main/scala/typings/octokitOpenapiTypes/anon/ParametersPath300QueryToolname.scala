package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath300QueryToolname extends StObject {
  
  var parameters: Path300QueryToolname
  
  var responses: `200Content264`
}
object ParametersPath300QueryToolname {
  
  inline def apply(parameters: Path300QueryToolname, responses: `200Content264`): ParametersPath300QueryToolname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath300QueryToolname]
  }
  
  extension [Self <: ParametersPath300QueryToolname](x: Self) {
    
    inline def setParameters(value: Path300QueryToolname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content264`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
