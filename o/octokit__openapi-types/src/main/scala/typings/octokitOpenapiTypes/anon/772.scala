package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `772` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Uniques]
}
object `772` {
  
  inline def apply(applicationSlashjson: js.Array[Uniques]): `772` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`772`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `772`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Uniques]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Uniques*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
