package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `414` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Instancesurl]
}
object `414` {
  
  inline def apply(applicationSlashjson: js.Array[Instancesurl]): `414` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`414`]
  }
  
  extension [Self <: `414`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Instancesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Instancesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
