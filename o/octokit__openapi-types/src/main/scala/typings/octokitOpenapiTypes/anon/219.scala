package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CreatedatId]
}
object `219` {
  
  inline def apply(applicationSlashjson: js.Array[CreatedatId]): `219` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`219`]
  }
  
  extension [Self <: `219`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[CreatedatId]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CreatedatId*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
