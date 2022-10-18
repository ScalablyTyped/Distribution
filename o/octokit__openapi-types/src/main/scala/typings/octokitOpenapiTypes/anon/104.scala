package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Deletable]
}
object `104` {
  
  inline def apply(applicationSlashjson: js.Array[Deletable]): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Deletable]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Deletable*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
