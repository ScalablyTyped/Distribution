package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `544` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Importurl]
}
object `544` {
  
  inline def apply(applicationSlashjson: js.Array[Importurl]): `544` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`544`]
  }
  
  extension [Self <: `544`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Importurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Importurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
