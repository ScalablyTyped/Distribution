package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `501` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CommitName]
}
object `501` {
  
  inline def apply(applicationSlashjson: js.Array[CommitName]): `501` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`501`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `501`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[CommitName]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CommitName*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
