package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404500 extends StObject {
  
  var parameters: PathCodespacename
  
  var responses: `404500`
}
object Responses404500 {
  
  inline def apply(parameters: PathCodespacename, responses: `404500`): Responses404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404500]
  }
  
  extension [Self <: Responses404500](x: Self) {
    
    inline def setParameters(value: PathCodespacename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
