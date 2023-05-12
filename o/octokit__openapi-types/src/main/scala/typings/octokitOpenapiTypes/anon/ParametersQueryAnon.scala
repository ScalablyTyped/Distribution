package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAnon extends StObject {
  
  var parameters: QueryAnon
  
  var responses: `200Content224`
}
object ParametersQueryAnon {
  
  inline def apply(parameters: QueryAnon, responses: `200Content224`): ParametersQueryAnon = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAnon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAnon] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAnon): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content224`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
