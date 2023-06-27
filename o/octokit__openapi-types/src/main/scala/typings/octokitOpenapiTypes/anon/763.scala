package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `763` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[js.Array[Double]]
}
object `763` {
  
  inline def apply(applicationSlashjson: js.Array[js.Array[Double]]): `763` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`763`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `763`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: js.Array[Double]*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
