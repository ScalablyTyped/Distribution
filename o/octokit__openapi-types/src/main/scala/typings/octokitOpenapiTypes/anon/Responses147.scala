package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses147 extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `147`
}
object Responses147 {
  
  inline def apply(parameters: PathIssuenumber, responses: `147`): Responses147 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses147]
  }
  
  extension [Self <: Responses147](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `147`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
