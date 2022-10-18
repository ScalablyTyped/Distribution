package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Head]
}
object `113` {
  
  inline def apply(applicationSlashjson: js.Array[Head]): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Head]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Head*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
