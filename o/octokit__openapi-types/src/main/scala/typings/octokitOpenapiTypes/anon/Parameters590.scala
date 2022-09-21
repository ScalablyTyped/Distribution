package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters590 extends StObject {
  
  var parameters: `590`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters590 {
  
  inline def apply(parameters: `590`, responses: `200ContentApplicationjsonCreatedatId`): Parameters590 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters590]
  }
  
  extension [Self <: Parameters590](x: Self) {
    
    inline def setParameters(value: `590`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
