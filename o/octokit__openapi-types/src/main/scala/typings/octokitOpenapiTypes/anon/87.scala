package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Productionenvironment]
}
object `87` {
  
  inline def apply(applicationSlashjson: js.Array[Productionenvironment]): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`87`]
  }
  
  extension [Self <: `87`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Productionenvironment]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Productionenvironment*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
