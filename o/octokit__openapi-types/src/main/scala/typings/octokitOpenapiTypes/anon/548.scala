package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `548` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Externalurl & Dictkey
}
object `548` {
  
  inline def apply(applicationSlashjson: Externalurl & Dictkey): `548` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`548`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `548`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Externalurl & Dictkey): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
