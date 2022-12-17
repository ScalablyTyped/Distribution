package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `504` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ContextCreatedat]
}
object `504` {
  
  inline def apply(applicationSlashjson: js.Array[ContextCreatedat]): `504` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`504`]
  }
  
  extension [Self <: `504`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[ContextCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ContextCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
