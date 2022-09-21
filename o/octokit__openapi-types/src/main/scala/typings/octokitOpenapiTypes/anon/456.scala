package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `456` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Authorizedcredentialexpiresat]
}
object `456` {
  
  inline def apply(applicationSlashjson: js.Array[Authorizedcredentialexpiresat]): `456` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`456`]
  }
  
  extension [Self <: `456`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Authorizedcredentialexpiresat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Authorizedcredentialexpiresat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
