package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses23 extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `23`
}
object Responses23 {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `23`): Responses23 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses23]
  }
  
  extension [Self <: Responses23](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `23`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
