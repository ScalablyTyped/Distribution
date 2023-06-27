package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `680` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommitName]
}
object `680` {
  
  inline def apply(applicationSlashjson: js.Array[CommitName]): `680` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`680`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `680`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[CommitName]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommitName*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
