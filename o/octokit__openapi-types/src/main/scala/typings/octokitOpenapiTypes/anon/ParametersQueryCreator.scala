package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCreator extends StObject {
  
  var parameters: QueryCreator
  
  var responses: `301404422`
}
object ParametersQueryCreator {
  
  inline def apply(parameters: QueryCreator, responses: `301404422`): ParametersQueryCreator = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCreator]
  }
  
  extension [Self <: ParametersQueryCreator](x: Self) {
    
    inline def setParameters(value: QueryCreator): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
