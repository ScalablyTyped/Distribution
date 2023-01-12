package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content29 extends StObject {
  
  var responses: `200Content29`
}
object Responses200Content29 {
  
  inline def apply(responses: `200Content29`): Responses200Content29 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content29]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content29] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content29`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
