package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath157Query extends StObject {
  
  var parameters: Path157Query
  
  var responses: `304401403404422`
}
object ParametersPath157Query {
  
  inline def apply(parameters: Path157Query, responses: `304401403404422`): ParametersPath157Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath157Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath157Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path157Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
