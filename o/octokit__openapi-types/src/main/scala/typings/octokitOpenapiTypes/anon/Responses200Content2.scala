package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content2 extends StObject {
  
  var responses: `200Content2`
}
object Responses200Content2 {
  
  inline def apply(responses: `200Content2`): Responses200Content2 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content2] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content2`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
