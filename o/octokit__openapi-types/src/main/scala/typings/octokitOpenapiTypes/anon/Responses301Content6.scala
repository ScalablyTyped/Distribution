package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses301Content6 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `301Content6`
}
object Responses301Content6 {
  
  inline def apply(parameters: PathIssuenumber, responses: `301Content6`): Responses301Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses301Content6]
  }
  
  extension [Self <: Responses301Content6](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
