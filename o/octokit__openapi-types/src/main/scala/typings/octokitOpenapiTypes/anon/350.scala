package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `350` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Idletimeoutminutes | Machine
}
object `350` {
  
  inline def apply(applicationSlashjson: Idletimeoutminutes | Machine): `350` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`350`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `350`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Idletimeoutminutes | Machine): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
