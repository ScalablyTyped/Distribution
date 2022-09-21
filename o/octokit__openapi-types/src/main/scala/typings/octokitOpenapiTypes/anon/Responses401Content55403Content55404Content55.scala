package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content55403Content55404Content55 extends StObject {
  
  var parameters: Path599
  
  var responses: `401Content55403Content55404Content55`
}
object Responses401Content55403Content55404Content55 {
  
  inline def apply(parameters: Path599, responses: `401Content55403Content55404Content55`): Responses401Content55403Content55404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content55403Content55404Content55]
  }
  
  extension [Self <: Responses401Content55403Content55404Content55](x: Self) {
    
    inline def setParameters(value: Path599): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content55403Content55404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
