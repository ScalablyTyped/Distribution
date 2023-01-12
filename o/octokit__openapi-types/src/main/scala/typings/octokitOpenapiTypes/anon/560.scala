package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `560` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Days]
}
object `560` {
  
  inline def apply(applicationSlashjson: js.Array[Days]): `560` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`560`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `560`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Days]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Days*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
