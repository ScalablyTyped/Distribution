package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `565` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidUpdatedat]
}
object `565` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidUpdatedat]): `565` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`565`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `565`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidUpdatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidUpdatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
