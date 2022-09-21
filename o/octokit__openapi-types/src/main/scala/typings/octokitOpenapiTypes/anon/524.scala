package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `524` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ContextCreatedat]
}
object `524` {
  
  inline def apply(applicationSlashjson: js.Array[ContextCreatedat]): `524` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`524`]
  }
  
  extension [Self <: `524`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[ContextCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ContextCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
