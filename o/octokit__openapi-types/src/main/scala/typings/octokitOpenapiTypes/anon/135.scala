package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Vcs | Null
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setApplicationSlashjson(value: Vcs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
