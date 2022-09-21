package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses356 extends StObject {
  
  var parameters: PathOrgScimuserid
  
  var responses: `356`
}
object Responses356 {
  
  inline def apply(parameters: PathOrgScimuserid, responses: `356`): Responses356 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses356]
  }
  
  extension [Self <: Responses356](x: Self) {
    
    inline def setParameters(value: PathOrgScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `356`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
