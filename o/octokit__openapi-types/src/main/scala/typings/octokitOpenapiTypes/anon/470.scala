package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `470` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Externalurl & Dictkey
}
object `470` {
  
  inline def apply(applicationSlashjson: Externalurl & Dictkey): `470` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`470`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `470`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Externalurl & Dictkey): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
