package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentHeaders extends StObject {
  
  var parameters: `57`
  
  var responses: `200ContentHeaders`
}
object Responses200ContentHeaders {
  
  inline def apply(parameters: `57`, responses: `200ContentHeaders`): Responses200ContentHeaders = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentHeaders]
  }
  
  extension [Self <: Responses200ContentHeaders](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentHeaders`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
