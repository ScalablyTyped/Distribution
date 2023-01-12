package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `582` extends StObject {
  
  var responses: `200Content446`
}
object `582` {
  
  inline def apply(responses: `200Content446`): `582` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`582`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `582`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content446`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
