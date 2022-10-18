package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Deletedat]
}
object `55` {
  
  inline def apply(applicationSlashjson: js.Array[Deletedat]): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Deletedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Deletedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
