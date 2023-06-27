package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content32 extends StObject {
  
  var responses: `200Content32`
}
object Responses200Content32 {
  
  inline def apply(responses: `200Content32`): Responses200Content32 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content32]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content32] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content32`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
