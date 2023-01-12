package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `458` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Ownerurl]
}
object `458` {
  
  inline def apply(applicationSlashjson: js.Array[Ownerurl]): `458` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`458`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `458`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Ownerurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Ownerurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
