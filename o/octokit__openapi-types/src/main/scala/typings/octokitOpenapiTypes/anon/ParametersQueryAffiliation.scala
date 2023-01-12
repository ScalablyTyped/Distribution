package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAffiliation extends StObject {
  
  var parameters: QueryAffiliation
  
  var responses: `304401403404422`
}
object ParametersQueryAffiliation {
  
  inline def apply(parameters: QueryAffiliation, responses: `304401403404422`): ParametersQueryAffiliation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAffiliation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAffiliation] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAffiliation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
