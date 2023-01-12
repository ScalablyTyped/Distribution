package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `362` extends StObject {
  
  var responses: `200Content78`
}
object `362` {
  
  inline def apply(responses: `200Content78`): `362` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`362`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `362`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content78`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
