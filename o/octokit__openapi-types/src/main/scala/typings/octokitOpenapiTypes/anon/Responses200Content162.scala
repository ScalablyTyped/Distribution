package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content162 extends StObject {
  
  var responses: `200Content162`
}
object Responses200Content162 {
  
  inline def apply(responses: `200Content162`): Responses200Content162 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content162]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content162] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content162`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
