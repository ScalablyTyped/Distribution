package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `793` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Canencryptcomms]
}
object `793` {
  
  inline def apply(applicationSlashjson: js.Array[Canencryptcomms]): `793` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`793`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `793`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Canencryptcomms]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Canencryptcomms*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
