package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `638` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Uniques]
}
object `638` {
  
  inline def apply(applicationSlashjson: js.Array[Uniques]): `638` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`638`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `638`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Uniques]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Uniques*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
