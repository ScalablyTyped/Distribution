package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Securityadvisory]
}
object `118` {
  
  inline def apply(applicationSlashjson: js.Array[Securityadvisory]): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Securityadvisory]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Securityadvisory*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
