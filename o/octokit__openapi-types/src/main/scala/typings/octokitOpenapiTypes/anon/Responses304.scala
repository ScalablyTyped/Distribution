package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304 extends StObject {
  
  var responses: `304`
}
object Responses304 {
  
  inline def apply(responses: `304`): Responses304 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
