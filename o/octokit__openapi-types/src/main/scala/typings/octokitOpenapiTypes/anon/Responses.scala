package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses extends StObject {
  
  var responses: `200`
}
object Responses {
  
  inline def apply(responses: `200`): Responses = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
