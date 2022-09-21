package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `570` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Originalline]
}
object `570` {
  
  inline def apply(applicationSlashjson: js.Array[Originalline]): `570` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`570`]
  }
  
  extension [Self <: `570`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Originalline]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Originalline*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
