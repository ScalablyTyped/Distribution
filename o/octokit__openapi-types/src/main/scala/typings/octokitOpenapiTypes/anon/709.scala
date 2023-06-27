package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `709` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Oid]
}
object `709` {
  
  inline def apply(applicationSlashjson: js.Array[Oid]): `709` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`709`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `709`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Oid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Oid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
