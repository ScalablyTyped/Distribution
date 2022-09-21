package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content592 extends StObject {
  
  var parameters: PathScimuseridString
  
  var responses: `403Content592`
}
object Responses403Content592 {
  
  inline def apply(parameters: PathScimuseridString, responses: `403Content592`): Responses403Content592 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content592]
  }
  
  extension [Self <: Responses403Content592](x: Self) {
    
    inline def setParameters(value: PathScimuseridString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content592`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
