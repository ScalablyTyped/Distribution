package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `483` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidUpdatedat]
}
object `483` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidUpdatedat]): `483` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`483`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `483`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidUpdatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidUpdatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
