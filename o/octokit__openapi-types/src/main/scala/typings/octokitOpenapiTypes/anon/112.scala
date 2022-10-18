package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Protected]
}
object `112` {
  
  inline def apply(applicationSlashjson: js.Array[Protected]): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Protected]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Protected*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
