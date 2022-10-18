package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DescriptionFiles | Null
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setApplicationSlashjson(value: DescriptionFiles): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
