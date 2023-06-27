package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `572` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Nodeid]
}
object `572` {
  
  inline def apply(applicationSlashjson: js.Array[Nodeid]): `572` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`572`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `572`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Nodeid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Nodeid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
