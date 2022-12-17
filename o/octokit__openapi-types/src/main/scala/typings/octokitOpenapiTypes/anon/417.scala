package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `417` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdOrg]
}
object `417` {
  
  inline def apply(applicationSlashjson: js.Array[IdOrg]): `417` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`417`]
  }
  
  extension [Self <: `417`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[IdOrg]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdOrg*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
