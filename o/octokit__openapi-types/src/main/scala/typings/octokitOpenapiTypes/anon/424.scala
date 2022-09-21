package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `424` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyHtmlurl]
}
object `424` {
  
  inline def apply(applicationSlashjson: js.Array[BodyHtmlurl]): `424` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`424`]
  }
  
  extension [Self <: `424`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[BodyHtmlurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyHtmlurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
