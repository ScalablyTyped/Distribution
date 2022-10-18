package typings.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditFinancingOptions extends StObject {
  
  /**
    * Indicates whether the cart amount is editable after payer's acceptance on PayPal side.
    */
  var cartAmountImmutable: Boolean
  
  /**
    * This is the estimated amount per month that the customer will need to pay including fees and interest.
    */
  var monthlyPayment: CurrencyAmount
  
  /**
    * Status of whether the customer ultimately was approved for and chose to make the payment using the approved installment credit.
    */
  var payerAcceptance: Boolean
  
  /**
    * Length of financing terms in months.
    */
  var term: Double
  
  /**
    * This is the estimated total payment amount including interest and fees the user will pay during the lifetime of the loan.
    */
  var totalCost: CurrencyAmount
  
  /**
    * Estimated interest or fees amount the payer will have to pay during the lifetime of the loan.
    */
  var totalInterest: CurrencyAmount
}
object CreditFinancingOptions {
  
  inline def apply(
    cartAmountImmutable: Boolean,
    monthlyPayment: CurrencyAmount,
    payerAcceptance: Boolean,
    term: Double,
    totalCost: CurrencyAmount,
    totalInterest: CurrencyAmount
  ): CreditFinancingOptions = {
    val __obj = js.Dynamic.literal(cartAmountImmutable = cartAmountImmutable.asInstanceOf[js.Any], monthlyPayment = monthlyPayment.asInstanceOf[js.Any], payerAcceptance = payerAcceptance.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], totalCost = totalCost.asInstanceOf[js.Any], totalInterest = totalInterest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditFinancingOptions]
  }
  
  extension [Self <: CreditFinancingOptions](x: Self) {
    
    inline def setCartAmountImmutable(value: Boolean): Self = StObject.set(x, "cartAmountImmutable", value.asInstanceOf[js.Any])
    
    inline def setMonthlyPayment(value: CurrencyAmount): Self = StObject.set(x, "monthlyPayment", value.asInstanceOf[js.Any])
    
    inline def setPayerAcceptance(value: Boolean): Self = StObject.set(x, "payerAcceptance", value.asInstanceOf[js.Any])
    
    inline def setTerm(value: Double): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTotalCost(value: CurrencyAmount): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalInterest(value: CurrencyAmount): Self = StObject.set(x, "totalInterest", value.asInstanceOf[js.Any])
  }
}
