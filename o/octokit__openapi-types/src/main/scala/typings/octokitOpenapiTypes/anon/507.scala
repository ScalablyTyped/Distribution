package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `507` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Securityadvisory]
}
object `507` {
  
  inline def apply(applicationSlashjson: js.Array[Securityadvisory]): `507` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`507`]
  }
  
  extension [Self <: `507`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Securityadvisory]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Securityadvisory*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
