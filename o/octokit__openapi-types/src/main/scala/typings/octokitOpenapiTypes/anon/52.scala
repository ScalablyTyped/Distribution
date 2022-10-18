package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Blobsurl]
}
object `52` {
  
  inline def apply(applicationSlashjson: js.Array[Blobsurl]): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Blobsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Blobsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
