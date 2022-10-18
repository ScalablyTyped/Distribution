package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Idletimeoutminutes | Machine
}
object `196` {
  
  inline def apply(applicationSlashjson: Idletimeoutminutes | Machine): `196` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setApplicationSlashjson(value: Idletimeoutminutes | Machine): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
