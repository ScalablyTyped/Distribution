package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `614` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Allowupdatebranch]
}
object `614` {
  
  inline def apply(applicationSlashjson: js.Array[Allowupdatebranch]): `614` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`614`]
  }
  
  extension [Self <: `614`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
