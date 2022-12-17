package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202401403 extends StObject {
  
  var parameters: Path356
  
  var responses: `202401403`
}
object Responses202401403 {
  
  inline def apply(parameters: Path356, responses: `202401403`): Responses202401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202401403]
  }
  
  extension [Self <: Responses202401403](x: Self) {
    
    inline def setParameters(value: Path356): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
