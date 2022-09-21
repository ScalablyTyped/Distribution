package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bodytext]
}
object `547` {
  
  inline def apply(applicationSlashjson: js.Array[Bodytext]): `547` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`547`]
  }
  
  extension [Self <: `547`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Bodytext]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bodytext*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
