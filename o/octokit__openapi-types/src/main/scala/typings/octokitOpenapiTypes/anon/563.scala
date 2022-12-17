package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `563` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Tarballurl]
}
object `563` {
  
  inline def apply(applicationSlashjson: js.Array[Tarballurl]): `563` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`563`]
  }
  
  extension [Self <: `563`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Tarballurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Tarballurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
