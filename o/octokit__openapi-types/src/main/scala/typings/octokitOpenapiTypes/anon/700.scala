package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `700` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidObject]
}
object `700` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidObject]): `700` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`700`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `700`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidObject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidObject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
