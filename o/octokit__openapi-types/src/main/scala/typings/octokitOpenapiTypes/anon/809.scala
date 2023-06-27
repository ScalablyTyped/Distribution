package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `809` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Reposcount]
}
object `809` {
  
  inline def apply(applicationSlashjson: js.Array[Reposcount]): `809` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`809`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `809`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Reposcount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Reposcount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
