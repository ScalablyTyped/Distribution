package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalCardFormData
  extends StObject
     with _AdditionalPaymentFormData {
  
  var bin: String
}
object AdditionalCardFormData {
  
  inline def apply(bin: String): AdditionalCardFormData = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalCardFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalCardFormData] (val x: Self) extends AnyVal {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
  }
}
