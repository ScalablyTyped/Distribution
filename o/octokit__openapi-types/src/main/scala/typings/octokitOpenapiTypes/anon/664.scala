package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `664` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Provider]
}
object `664` {
  
  inline def apply(applicationSlashjson: js.Array[Provider]): `664` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`664`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `664`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Provider]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Provider*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
