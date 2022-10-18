package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Htmlurl]
}
object `30` {
  
  inline def apply(applicationSlashjson: js.Array[Htmlurl]): `30` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Htmlurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Htmlurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
