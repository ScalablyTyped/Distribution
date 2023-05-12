package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `533` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[NodeidUser]
}
object `533` {
  
  inline def apply(applicationSlashjson: js.Array[NodeidUser]): `533` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`533`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `533`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[NodeidUser]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: NodeidUser*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
