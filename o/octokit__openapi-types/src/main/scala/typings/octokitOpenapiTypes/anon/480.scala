package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `480` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdOrg]
}
object `480` {
  
  inline def apply(applicationSlashjson: js.Array[IdOrg]): `480` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`480`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `480`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[IdOrg]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdOrg*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
