package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickController extends StObject {
  
  def getAdditionalData(): js.Promise[AdditionalCardFormData | AdditionalPaymentFormData]
  
  def getFormData(): js.Promise[CardFormData | PaymentFormData]
  
  def unmount(): Unit
}
object BrickController {
  
  inline def apply(
    getAdditionalData: () => js.Promise[AdditionalCardFormData | AdditionalPaymentFormData],
    getFormData: () => js.Promise[CardFormData | PaymentFormData],
    unmount: () => Unit
  ): BrickController = {
    val __obj = js.Dynamic.literal(getAdditionalData = js.Any.fromFunction0(getAdditionalData), getFormData = js.Any.fromFunction0(getFormData), unmount = js.Any.fromFunction0(unmount))
    __obj.asInstanceOf[BrickController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickController] (val x: Self) extends AnyVal {
    
    inline def setGetAdditionalData(value: () => js.Promise[AdditionalCardFormData | AdditionalPaymentFormData]): Self = StObject.set(x, "getAdditionalData", js.Any.fromFunction0(value))
    
    inline def setGetFormData(value: () => js.Promise[CardFormData | PaymentFormData]): Self = StObject.set(x, "getFormData", js.Any.fromFunction0(value))
    
    inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
  }
}
