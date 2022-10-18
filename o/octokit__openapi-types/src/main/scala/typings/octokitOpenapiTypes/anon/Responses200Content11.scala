package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content11 extends StObject {
  
  var responses: `200Content11`
}
object Responses200Content11 {
  
  inline def apply(responses: `200Content11`): Responses200Content11 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content11]
  }
  
  extension [Self <: Responses200Content11](x: Self) {
    
    inline def setResponses(value: `200Content11`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
