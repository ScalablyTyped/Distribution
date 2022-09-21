package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `486` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyColumnsurl]
}
object `486` {
  
  inline def apply(applicationSlashjson: js.Array[BodyColumnsurl]): `486` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`486`]
  }
  
  extension [Self <: `486`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[BodyColumnsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyColumnsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
