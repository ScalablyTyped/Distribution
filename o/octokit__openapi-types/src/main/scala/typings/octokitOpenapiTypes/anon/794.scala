package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `794` extends StObject {
  
  var responses: `200Content601`
}
object `794` {
  
  inline def apply(responses: `200Content601`): `794` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`794`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `794`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content601`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
