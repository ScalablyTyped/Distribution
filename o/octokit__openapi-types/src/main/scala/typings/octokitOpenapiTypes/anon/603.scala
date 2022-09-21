package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `603` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[EmailPrimary]
}
object `603` {
  
  inline def apply(applicationSlashjson: js.Array[EmailPrimary]): `603` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`603`]
  }
  
  extension [Self <: `603`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[EmailPrimary]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: EmailPrimary*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
