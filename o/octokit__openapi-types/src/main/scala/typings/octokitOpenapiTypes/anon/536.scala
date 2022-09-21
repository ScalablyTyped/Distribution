package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `536` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidObject]
}
object `536` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidObject]): `536` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`536`]
  }
  
  extension [Self <: `536`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidObject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidObject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
