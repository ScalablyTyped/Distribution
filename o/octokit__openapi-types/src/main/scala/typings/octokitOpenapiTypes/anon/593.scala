package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `593` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Invitee]
}
object `593` {
  
  inline def apply(applicationSlashjson: js.Array[Invitee]): `593` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`593`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `593`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Invitee]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Invitee*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
