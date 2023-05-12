package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content39 extends StObject {
  
  var responses: `200Content39`
}
object Responses200Content39 {
  
  inline def apply(responses: `200Content39`): Responses200Content39 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content39]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content39] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content39`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
