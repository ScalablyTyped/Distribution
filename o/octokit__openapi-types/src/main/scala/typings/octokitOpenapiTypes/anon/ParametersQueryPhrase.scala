package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPhrase extends StObject {
  
  var parameters: QueryPhrase
  
  var responses: `200Content431`
}
object ParametersQueryPhrase {
  
  inline def apply(parameters: QueryPhrase, responses: `200Content431`): ParametersQueryPhrase = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPhrase]
  }
  
  extension [Self <: ParametersQueryPhrase](x: Self) {
    
    inline def setParameters(value: QueryPhrase): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content431`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
