package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses24 extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `24`
}
object Responses24 {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `24`): Responses24 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses24]
  }
  
  extension [Self <: Responses24](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
