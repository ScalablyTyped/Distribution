package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `458` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DescriptionName]
}
object `458` {
  
  inline def apply(applicationSlashjson: js.Array[DescriptionName]): `458` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`458`]
  }
  
  extension [Self <: `458`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[DescriptionName]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DescriptionName*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
