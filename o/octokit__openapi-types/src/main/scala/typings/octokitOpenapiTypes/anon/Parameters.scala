package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var responses: `200Content0`
}
object Parameters {
  
  inline def apply(responses: `200Content0`): Parameters = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setResponses(value: `200Content0`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
