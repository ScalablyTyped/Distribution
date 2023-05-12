package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304 extends StObject {
  
  var responses: `200304`
}
object Responses200304 {
  
  inline def apply(responses: `200304`): Responses200304 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200304] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
