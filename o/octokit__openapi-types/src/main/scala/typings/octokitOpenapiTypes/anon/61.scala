package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidUser]
}
object `61` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidUser]): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidUser]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidUser*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
