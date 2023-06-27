package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `821` extends StObject {
  
  var responses: `200Content32404Content41`
}
object `821` {
  
  inline def apply(responses: `200Content32404Content41`): `821` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`821`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `821`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content32404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
