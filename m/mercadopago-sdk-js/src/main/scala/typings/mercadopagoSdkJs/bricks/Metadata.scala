package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var payment_mode: String
  
  var payment_point: String
}
object Metadata {
  
  inline def apply(payment_mode: String, payment_point: String): Metadata = {
    val __obj = js.Dynamic.literal(payment_mode = payment_mode.asInstanceOf[js.Any], payment_point = payment_point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setPayment_mode(value: String): Self = StObject.set(x, "payment_mode", value.asInstanceOf[js.Any])
    
    inline def setPayment_point(value: String): Self = StObject.set(x, "payment_point", value.asInstanceOf[js.Any])
  }
}
