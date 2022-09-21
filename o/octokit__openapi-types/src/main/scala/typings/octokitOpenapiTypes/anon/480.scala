package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `480` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Lasteditedat]
}
object `480` {
  
  inline def apply(applicationSlashjson: js.Array[Lasteditedat]): `480` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`480`]
  }
  
  extension [Self <: `480`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Lasteditedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Lasteditedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
