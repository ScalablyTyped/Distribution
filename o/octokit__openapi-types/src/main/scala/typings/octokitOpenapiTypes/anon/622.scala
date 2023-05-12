package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `622` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Downloadcount]
}
object `622` {
  
  inline def apply(applicationSlashjson: js.Array[Downloadcount]): `622` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`622`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `622`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Downloadcount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Downloadcount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
