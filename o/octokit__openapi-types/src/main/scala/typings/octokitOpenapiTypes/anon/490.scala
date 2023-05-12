package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `490` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Marketplacependingchange]
}
object `490` {
  
  inline def apply(applicationSlashjson: js.Array[Marketplacependingchange]): `490` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`490`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `490`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Marketplacependingchange]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Marketplacependingchange*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
