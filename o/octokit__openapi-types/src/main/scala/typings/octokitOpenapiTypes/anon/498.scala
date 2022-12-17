package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `498` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[AuthorassociationBody]
}
object `498` {
  
  inline def apply(applicationSlashjson: js.Array[AuthorassociationBody]): `498` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`498`]
  }
  
  extension [Self <: `498`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[AuthorassociationBody]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: AuthorassociationBody*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
