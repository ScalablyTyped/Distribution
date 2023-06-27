package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `693` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Logurl]
}
object `693` {
  
  inline def apply(applicationSlashjson: js.Array[Logurl]): `693` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`693`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `693`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Logurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Logurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
