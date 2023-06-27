package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `636` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ArchivedColumnname]
}
object `636` {
  
  inline def apply(applicationSlashjson: js.Array[ArchivedColumnname]): `636` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`636`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `636`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[ArchivedColumnname]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ArchivedColumnname*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
