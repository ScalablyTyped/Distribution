package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses616 extends StObject {
  
  var parameters: Path615
  
  var responses: `616`
}
object Responses616 {
  
  inline def apply(parameters: Path615, responses: `616`): Responses616 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses616]
  }
  
  extension [Self <: Responses616](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `616`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
