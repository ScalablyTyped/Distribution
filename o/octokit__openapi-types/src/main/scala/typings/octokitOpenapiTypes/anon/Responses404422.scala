package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404422 extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `404422`
}
object Responses404422 {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `404422`): Responses404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404422]
  }
  
  extension [Self <: Responses404422](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
