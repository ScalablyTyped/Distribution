package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `427` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Accountsurl]
}
object `427` {
  
  inline def apply(applicationSlashjson: js.Array[Accountsurl]): `427` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`427`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `427`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Accountsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Accountsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
