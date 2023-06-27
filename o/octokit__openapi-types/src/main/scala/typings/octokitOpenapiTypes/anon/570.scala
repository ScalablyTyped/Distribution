package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `570` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bodyhtml]
}
object `570` {
  
  inline def apply(applicationSlashjson: js.Array[Bodyhtml]): `570` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`570`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `570`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Bodyhtml]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bodyhtml*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
