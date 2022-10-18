package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Expectedheadsha | Null
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setApplicationSlashjson(value: Expectedheadsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
