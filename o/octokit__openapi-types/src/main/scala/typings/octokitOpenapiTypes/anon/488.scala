package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `488` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Externalurl]
}
object `488` {
  
  inline def apply(applicationSlashjson: js.Array[Externalurl]): `488` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`488`]
  }
  
  extension [Self <: `488`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Externalurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Externalurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
