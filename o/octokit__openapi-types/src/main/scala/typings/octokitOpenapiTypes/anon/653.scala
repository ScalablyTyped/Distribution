package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `653` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Task]
}
object `653` {
  
  inline def apply(applicationSlashjson: js.Array[Task]): `653` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`653`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `653`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Task]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Task*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
