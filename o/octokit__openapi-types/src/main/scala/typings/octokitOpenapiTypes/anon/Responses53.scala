package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses53 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `53`
}
object Responses53 {
  
  inline def apply(parameters: PathOrgString, responses: `53`): Responses53 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses53]
  }
  
  extension [Self <: Responses53](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `53`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
