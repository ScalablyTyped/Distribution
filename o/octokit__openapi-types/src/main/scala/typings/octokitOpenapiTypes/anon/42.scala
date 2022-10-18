package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Failedreason]
}
object `42` {
  
  inline def apply(applicationSlashjson: js.Array[Failedreason]): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Failedreason]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Failedreason*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
