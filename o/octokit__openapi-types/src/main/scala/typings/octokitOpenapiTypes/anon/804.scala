package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `804` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Allowupdatebranch]
}
object `804` {
  
  inline def apply(applicationSlashjson: js.Array[Allowupdatebranch]): `804` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`804`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `804`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
