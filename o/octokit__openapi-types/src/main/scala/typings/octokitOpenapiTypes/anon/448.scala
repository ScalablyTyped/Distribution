package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `448` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Hooksurl]
}
object `448` {
  
  inline def apply(applicationSlashjson: js.Array[Hooksurl]): `448` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`448`]
  }
  
  extension [Self <: `448`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Hooksurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Hooksurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
