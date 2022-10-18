package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content4 extends StObject {
  
  var parameters: Path273
  
  var responses: `404Content4`
}
object Responses404Content4 {
  
  inline def apply(parameters: Path273, responses: `404Content4`): Responses404Content4 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content4]
  }
  
  extension [Self <: Responses404Content4](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
