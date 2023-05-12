package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `318` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Idletimeoutminutes | Null
}
object `318` {
  
  inline def apply(): `318` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`318`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `318`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Idletimeoutminutes): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
