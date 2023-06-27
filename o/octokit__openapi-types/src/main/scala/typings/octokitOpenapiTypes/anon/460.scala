package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `460` extends StObject {
  
  var responses: `200Content94`
}
object `460` {
  
  inline def apply(responses: `200Content94`): `460` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`460`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `460`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content94`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
