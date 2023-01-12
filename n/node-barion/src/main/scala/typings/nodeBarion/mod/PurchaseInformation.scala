package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.AccountFunding
import typings.nodeBarion.nodeBarionStrings.CheckAcceptance
import typings.nodeBarion.nodeBarionStrings.DigitalGoods
import typings.nodeBarion.nodeBarionStrings.ElectronicDelivery
import typings.nodeBarion.nodeBarionStrings.FirstTimeOrdered
import typings.nodeBarion.nodeBarionStrings.FutureAvailability
import typings.nodeBarion.nodeBarionStrings.GoodsAndServicePurchase
import typings.nodeBarion.nodeBarionStrings.MerchandiseAvailable
import typings.nodeBarion.nodeBarionStrings.Other
import typings.nodeBarion.nodeBarionStrings.OvernightShipping
import typings.nodeBarion.nodeBarionStrings.PrePaidVacationAndLoan
import typings.nodeBarion.nodeBarionStrings.QuasiCashTransaction
import typings.nodeBarion.nodeBarionStrings.Reordered
import typings.nodeBarion.nodeBarionStrings.SameDayShipping
import typings.nodeBarion.nodeBarionStrings.ShipToAnotherVerifiedAddress
import typings.nodeBarion.nodeBarionStrings.ShipToCardholdersBillingAddress
import typings.nodeBarion.nodeBarionStrings.ShipToDifferentAddress
import typings.nodeBarion.nodeBarionStrings.ShipToStore
import typings.nodeBarion.nodeBarionStrings.TravelAndEventTickets
import typings.nodeBarion.nodeBarionStrings.TwoDayOrMoreShipping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseInformation extends StObject {
  
  var AvailabilityIndicator: js.UndefOr[MerchandiseAvailable | FutureAvailability] = js.undefined
  
  var DeliveryEmailAddress: js.UndefOr[String] = js.undefined
  
  var DeliveryTimeframe: js.UndefOr[ElectronicDelivery | SameDayShipping | OvernightShipping | TwoDayOrMoreShipping] = js.undefined
  
  var GiftCardPurchase: js.UndefOr[typings.nodeBarion.mod.GiftCardPurchase] = js.undefined
  
  var PreOrderDate: js.UndefOr[js.Date] = js.undefined
  
  var PurchaseDate: js.UndefOr[js.Date] = js.undefined
  
  var PurchaseType: js.UndefOr[
    GoodsAndServicePurchase | CheckAcceptance | AccountFunding | QuasiCashTransaction | PrePaidVacationAndLoan
  ] = js.undefined
  
  var ReOrderIndicator: js.UndefOr[FirstTimeOrdered | Reordered] = js.undefined
  
  var RecurringExpiry: js.UndefOr[js.Date] = js.undefined
  
  var RecurringFrequency: js.UndefOr[Double] = js.undefined
  
  var ShippingAddressIndicator: js.UndefOr[
    ShipToCardholdersBillingAddress | ShipToAnotherVerifiedAddress | ShipToDifferentAddress | ShipToStore | DigitalGoods | TravelAndEventTickets | Other
  ] = js.undefined
}
object PurchaseInformation {
  
  inline def apply(): PurchaseInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseInformation] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityIndicator(value: MerchandiseAvailable | FutureAvailability): Self = StObject.set(x, "AvailabilityIndicator", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityIndicatorUndefined: Self = StObject.set(x, "AvailabilityIndicator", js.undefined)
    
    inline def setDeliveryEmailAddress(value: String): Self = StObject.set(x, "DeliveryEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryEmailAddressUndefined: Self = StObject.set(x, "DeliveryEmailAddress", js.undefined)
    
    inline def setDeliveryTimeframe(value: ElectronicDelivery | SameDayShipping | OvernightShipping | TwoDayOrMoreShipping): Self = StObject.set(x, "DeliveryTimeframe", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeframeUndefined: Self = StObject.set(x, "DeliveryTimeframe", js.undefined)
    
    inline def setGiftCardPurchase(value: GiftCardPurchase): Self = StObject.set(x, "GiftCardPurchase", value.asInstanceOf[js.Any])
    
    inline def setGiftCardPurchaseUndefined: Self = StObject.set(x, "GiftCardPurchase", js.undefined)
    
    inline def setPreOrderDate(value: js.Date): Self = StObject.set(x, "PreOrderDate", value.asInstanceOf[js.Any])
    
    inline def setPreOrderDateUndefined: Self = StObject.set(x, "PreOrderDate", js.undefined)
    
    inline def setPurchaseDate(value: js.Date): Self = StObject.set(x, "PurchaseDate", value.asInstanceOf[js.Any])
    
    inline def setPurchaseDateUndefined: Self = StObject.set(x, "PurchaseDate", js.undefined)
    
    inline def setPurchaseType(
      value: GoodsAndServicePurchase | CheckAcceptance | AccountFunding | QuasiCashTransaction | PrePaidVacationAndLoan
    ): Self = StObject.set(x, "PurchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "PurchaseType", js.undefined)
    
    inline def setReOrderIndicator(value: FirstTimeOrdered | Reordered): Self = StObject.set(x, "ReOrderIndicator", value.asInstanceOf[js.Any])
    
    inline def setReOrderIndicatorUndefined: Self = StObject.set(x, "ReOrderIndicator", js.undefined)
    
    inline def setRecurringExpiry(value: js.Date): Self = StObject.set(x, "RecurringExpiry", value.asInstanceOf[js.Any])
    
    inline def setRecurringExpiryUndefined: Self = StObject.set(x, "RecurringExpiry", js.undefined)
    
    inline def setRecurringFrequency(value: Double): Self = StObject.set(x, "RecurringFrequency", value.asInstanceOf[js.Any])
    
    inline def setRecurringFrequencyUndefined: Self = StObject.set(x, "RecurringFrequency", js.undefined)
    
    inline def setShippingAddressIndicator(
      value: ShipToCardholdersBillingAddress | ShipToAnotherVerifiedAddress | ShipToDifferentAddress | ShipToStore | DigitalGoods | TravelAndEventTickets | Other
    ): Self = StObject.set(x, "ShippingAddressIndicator", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressIndicatorUndefined: Self = StObject.set(x, "ShippingAddressIndicator", js.undefined)
  }
}
