package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Avatarurl]
}
object `41` {
  
  inline def apply(applicationSlashjson: js.Array[Avatarurl]): `41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Avatarurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Avatarurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
