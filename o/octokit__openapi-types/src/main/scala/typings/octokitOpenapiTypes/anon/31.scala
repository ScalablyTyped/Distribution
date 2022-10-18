package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Accountsurl]
}
object `31` {
  
  inline def apply(applicationSlashjson: js.Array[Accountsurl]): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Accountsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Accountsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
