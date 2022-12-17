package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content12 extends StObject {
  
  var responses: `200Content12`
}
object Responses200Content12 {
  
  inline def apply(responses: `200Content12`): Responses200Content12 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content12]
  }
  
  extension [Self <: Responses200Content12](x: Self) {
    
    inline def setResponses(value: `200Content12`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
