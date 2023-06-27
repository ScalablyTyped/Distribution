package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `554` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[AccountCreatedat]
}
object `554` {
  
  inline def apply(applicationSlashjson: js.Array[AccountCreatedat]): `554` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`554`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `554`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[AccountCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: AccountCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
