package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `512` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Blobhref]
}
object `512` {
  
  inline def apply(applicationSlashjson: js.Array[Blobhref]): `512` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`512`]
  }
  
  extension [Self <: `512`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Blobhref]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Blobhref*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
