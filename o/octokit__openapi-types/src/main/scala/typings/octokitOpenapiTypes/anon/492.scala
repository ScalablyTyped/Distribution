package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `492` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Mostrecentinstance]
}
object `492` {
  
  inline def apply(applicationSlashjson: js.Array[Mostrecentinstance]): `492` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`492`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `492`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Mostrecentinstance]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Mostrecentinstance*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
