package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `435` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdOrg]
}
object `435` {
  
  inline def apply(applicationSlashjson: js.Array[IdOrg]): `435` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`435`]
  }
  
  extension [Self <: `435`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[IdOrg]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdOrg*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
