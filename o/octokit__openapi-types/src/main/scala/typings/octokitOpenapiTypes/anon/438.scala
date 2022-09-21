package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyCreatedat]
}
object `438` {
  
  inline def apply(applicationSlashjson: js.Array[BodyCreatedat]): `438` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`438`]
  }
  
  extension [Self <: `438`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[BodyCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
