package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Isalphanumeric]
}
object `90` {
  
  inline def apply(applicationSlashjson: js.Array[Isalphanumeric]): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`90`]
  }
  
  extension [Self <: `90`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Isalphanumeric]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Isalphanumeric*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
