package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAnon extends StObject {
  
  var parameters: QueryAnon
  
  var responses: `200Content211`
}
object ParametersQueryAnon {
  
  inline def apply(parameters: QueryAnon, responses: `200Content211`): ParametersQueryAnon = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAnon]
  }
  
  extension [Self <: ParametersQueryAnon](x: Self) {
    
    inline def setParameters(value: QueryAnon): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content211`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
