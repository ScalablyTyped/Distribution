package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DetailsType]
}
object `182` {
  
  inline def apply(applicationSlashjson: js.Array[DetailsType]): `182` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  extension [Self <: `182`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[DetailsType]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DetailsType*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
