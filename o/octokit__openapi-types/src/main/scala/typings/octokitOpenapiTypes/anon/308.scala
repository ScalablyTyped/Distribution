package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `308` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Idletimeoutminutes | Null
}
object `308` {
  
  inline def apply(): `308` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`308`]
  }
  
  extension [Self <: `308`](x: Self) {
    
    inline def setApplicationSlashjson(value: Idletimeoutminutes): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
