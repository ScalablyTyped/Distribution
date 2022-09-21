package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `519` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Followingurl]
}
object `519` {
  
  inline def apply(applicationSlashjson: js.Array[Followingurl]): `519` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`519`]
  }
  
  extension [Self <: `519`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Followingurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Followingurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
