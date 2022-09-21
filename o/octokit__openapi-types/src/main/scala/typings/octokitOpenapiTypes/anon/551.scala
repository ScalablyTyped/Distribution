package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `551` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DescriptionId]
}
object `551` {
  
  inline def apply(applicationSlashjson: js.Array[DescriptionId]): `551` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`551`]
  }
  
  extension [Self <: `551`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[DescriptionId]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DescriptionId*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
