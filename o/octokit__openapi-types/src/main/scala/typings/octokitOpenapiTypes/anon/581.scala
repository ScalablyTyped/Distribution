package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Canencryptcomms]
}
object `581` {
  
  inline def apply(applicationSlashjson: js.Array[Canencryptcomms]): `581` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`581`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `581`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Canencryptcomms]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Canencryptcomms*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
