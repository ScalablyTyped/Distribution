package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `575` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Pushprotectionbypassedby]
}
object `575` {
  
  inline def apply(applicationSlashjson: js.Array[Pushprotectionbypassedby]): `575` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`575`]
  }
  
  extension [Self <: `575`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Pushprotectionbypassedby]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Pushprotectionbypassedby*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
