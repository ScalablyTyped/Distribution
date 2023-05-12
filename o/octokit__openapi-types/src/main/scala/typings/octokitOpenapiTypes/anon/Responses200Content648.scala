package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content648 extends StObject {
  
  var responses: `200Content648`
}
object Responses200Content648 {
  
  inline def apply(responses: `200Content648`): Responses200Content648 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content648]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content648] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content648`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
