package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommitName]
}
object `569` {
  
  inline def apply(applicationSlashjson: js.Array[CommitName]): `569` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`569`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `569`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[CommitName]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommitName*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
