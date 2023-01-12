package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `517` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidObject]
}
object `517` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidObject]): `517` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`517`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `517`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidObject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidObject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
