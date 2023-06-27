package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `282` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deploymentbranchpolicy | Null
}
object `282` {
  
  inline def apply(): `282` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`282`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `282`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Deploymentbranchpolicy): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
