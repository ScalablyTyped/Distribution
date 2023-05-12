package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `472` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Deliveredat]
}
object `472` {
  
  inline def apply(applicationSlashjson: js.Array[Deliveredat]): `472` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`472`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `472`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Deliveredat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Deliveredat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
