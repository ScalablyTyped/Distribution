package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200404422 extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `200404422`
}
object Responses200404422 {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `200404422`): Responses200404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200404422]
  }
  
  extension [Self <: Responses200404422](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
