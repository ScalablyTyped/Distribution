package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `394` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Externalurl & Dictkey
}
object `394` {
  
  inline def apply(applicationSlashjson: Externalurl & Dictkey): `394` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`394`]
  }
  
  extension [Self <: `394`](x: Self) {
    
    inline def setApplicationSlashjson(value: Externalurl & Dictkey): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
