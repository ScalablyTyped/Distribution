package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content15 extends StObject {
  
  var responses: `200Content15`
}
object Responses200Content15 {
  
  inline def apply(responses: `200Content15`): Responses200Content15 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content15]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content15] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content15`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
