package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses453 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `453`
}
object Responses453 {
  
  inline def apply(parameters: PathOrgString, responses: `453`): Responses453 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses453]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses453] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
