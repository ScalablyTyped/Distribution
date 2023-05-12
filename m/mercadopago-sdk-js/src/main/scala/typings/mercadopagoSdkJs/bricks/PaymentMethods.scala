package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethods extends StObject {
  
  var atm: js.UndefOr[GenericPaymentMethod] = js.undefined
  
  var bankTransfer: js.UndefOr[GenericPaymentMethod] = js.undefined
  
  var creditCard: js.UndefOr[GenericPaymentMethod] = js.undefined
  
  var debitCard: js.UndefOr[GenericPaymentMethod] = js.undefined
  
  var maxInstallments: js.UndefOr[Double] = js.undefined
  
  var mercadoPago: js.UndefOr[GenericPaymentMethod] = js.undefined
  
  var minInstallments: js.UndefOr[Double] = js.undefined
  
  var ticket: js.UndefOr[GenericPaymentMethod] = js.undefined
}
object PaymentMethods {
  
  inline def apply(): PaymentMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethods] (val x: Self) extends AnyVal {
    
    inline def setAtm(value: GenericPaymentMethod): Self = StObject.set(x, "atm", value.asInstanceOf[js.Any])
    
    inline def setAtmUndefined: Self = StObject.set(x, "atm", js.undefined)
    
    inline def setAtmVarargs(value: String*): Self = StObject.set(x, "atm", js.Array(value*))
    
    inline def setBankTransfer(value: GenericPaymentMethod): Self = StObject.set(x, "bankTransfer", value.asInstanceOf[js.Any])
    
    inline def setBankTransferUndefined: Self = StObject.set(x, "bankTransfer", js.undefined)
    
    inline def setBankTransferVarargs(value: String*): Self = StObject.set(x, "bankTransfer", js.Array(value*))
    
    inline def setCreditCard(value: GenericPaymentMethod): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    inline def setCreditCardVarargs(value: String*): Self = StObject.set(x, "creditCard", js.Array(value*))
    
    inline def setDebitCard(value: GenericPaymentMethod): Self = StObject.set(x, "debitCard", value.asInstanceOf[js.Any])
    
    inline def setDebitCardUndefined: Self = StObject.set(x, "debitCard", js.undefined)
    
    inline def setDebitCardVarargs(value: String*): Self = StObject.set(x, "debitCard", js.Array(value*))
    
    inline def setMaxInstallments(value: Double): Self = StObject.set(x, "maxInstallments", value.asInstanceOf[js.Any])
    
    inline def setMaxInstallmentsUndefined: Self = StObject.set(x, "maxInstallments", js.undefined)
    
    inline def setMercadoPago(value: GenericPaymentMethod): Self = StObject.set(x, "mercadoPago", value.asInstanceOf[js.Any])
    
    inline def setMercadoPagoUndefined: Self = StObject.set(x, "mercadoPago", js.undefined)
    
    inline def setMercadoPagoVarargs(value: String*): Self = StObject.set(x, "mercadoPago", js.Array(value*))
    
    inline def setMinInstallments(value: Double): Self = StObject.set(x, "minInstallments", value.asInstanceOf[js.Any])
    
    inline def setMinInstallmentsUndefined: Self = StObject.set(x, "minInstallments", js.undefined)
    
    inline def setTicket(value: GenericPaymentMethod): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    
    inline def setTicketUndefined: Self = StObject.set(x, "ticket", js.undefined)
    
    inline def setTicketVarargs(value: String*): Self = StObject.set(x, "ticket", js.Array(value*))
  }
}
