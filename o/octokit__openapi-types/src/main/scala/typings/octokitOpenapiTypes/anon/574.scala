package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `574` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Marketplacependingchange]
}
object `574` {
  
  inline def apply(applicationSlashjson: js.Array[Marketplacependingchange]): `574` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`574`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `574`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Marketplacependingchange]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Marketplacependingchange*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
