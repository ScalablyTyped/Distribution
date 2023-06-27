package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `626` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Lasteditedat]
}
object `626` {
  
  inline def apply(applicationSlashjson: js.Array[Lasteditedat]): `626` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`626`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `626`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Lasteditedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Lasteditedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
