package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `561` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Weeks]
}
object `561` {
  
  inline def apply(applicationSlashjson: js.Array[Weeks]): `561` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`561`]
  }
  
  extension [Self <: `561`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Weeks]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Weeks*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
