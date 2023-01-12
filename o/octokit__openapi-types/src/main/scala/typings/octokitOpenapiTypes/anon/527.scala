package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `527` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Invitee]
}
object `527` {
  
  inline def apply(applicationSlashjson: js.Array[Invitee]): `527` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`527`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `527`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Invitee]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Invitee*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
