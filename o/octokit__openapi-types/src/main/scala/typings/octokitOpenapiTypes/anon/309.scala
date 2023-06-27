package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `309` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Vcs | Null
}
object `309` {
  
  inline def apply(): `309` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`309`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `309`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Vcs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
