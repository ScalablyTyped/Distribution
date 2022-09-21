package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.Between30And60Days
import typings.nodeBarion.nodeBarionStrings.ChangedDuringThisTransaction
import typings.nodeBarion.nodeBarionStrings.CreatedDuringThisTransaction
import typings.nodeBarion.nodeBarionStrings.LessThan30Days
import typings.nodeBarion.nodeBarionStrings.MoreThan60Days
import typings.nodeBarion.nodeBarionStrings.NoAccount
import typings.nodeBarion.nodeBarionStrings.NoChange
import typings.nodeBarion.nodeBarionStrings.NoSuspiciousActivityObserved
import typings.nodeBarion.nodeBarionStrings.SuspiciousActivityObserved
import typings.nodeBarion.nodeBarionStrings.ThisTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerAccountInformation extends StObject {
  
  var AccountChangeIndicator: js.UndefOr[
    ChangedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days
  ] = js.undefined
  
  var AccountCreated: js.UndefOr[js.Date] = js.undefined
  
  var AccountCreationIndicator: js.UndefOr[
    NoAccount | CreatedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days
  ] = js.undefined
  
  var AccountId: js.UndefOr[String] = js.undefined
  
  var AccountLastChanged: js.UndefOr[js.Date] = js.undefined
  
  var PasswordChangeIndicator: js.UndefOr[
    NoChange | ChangedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days
  ] = js.undefined
  
  var PasswordLastChanged: js.UndefOr[js.Date] = js.undefined
  
  var PaymentMethodAdded: js.UndefOr[js.Date] = js.undefined
  
  var ProvisionAttempts: js.UndefOr[Double] = js.undefined
  
  var PurchasesInTheLast6Months: js.UndefOr[Double] = js.undefined
  
  var ShippingAddressAdded: js.UndefOr[js.Date] = js.undefined
  
  var ShippingAddressUsageIndicator: js.UndefOr[ThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days] = js.undefined
  
  var SuspiciousActivityIndicator: js.UndefOr[NoSuspiciousActivityObserved | SuspiciousActivityObserved] = js.undefined
  
  var TransactionalActivityPerDay: js.UndefOr[Double] = js.undefined
  
  var TransactionalActivityPerYear: js.UndefOr[Double] = js.undefined
}
object PayerAccountInformation {
  
  inline def apply(): PayerAccountInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerAccountInformation]
  }
  
  extension [Self <: PayerAccountInformation](x: Self) {
    
    inline def setAccountChangeIndicator(value: ChangedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days): Self = StObject.set(x, "AccountChangeIndicator", value.asInstanceOf[js.Any])
    
    inline def setAccountChangeIndicatorUndefined: Self = StObject.set(x, "AccountChangeIndicator", js.undefined)
    
    inline def setAccountCreated(value: js.Date): Self = StObject.set(x, "AccountCreated", value.asInstanceOf[js.Any])
    
    inline def setAccountCreatedUndefined: Self = StObject.set(x, "AccountCreated", js.undefined)
    
    inline def setAccountCreationIndicator(
      value: NoAccount | CreatedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days
    ): Self = StObject.set(x, "AccountCreationIndicator", value.asInstanceOf[js.Any])
    
    inline def setAccountCreationIndicatorUndefined: Self = StObject.set(x, "AccountCreationIndicator", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAccountLastChanged(value: js.Date): Self = StObject.set(x, "AccountLastChanged", value.asInstanceOf[js.Any])
    
    inline def setAccountLastChangedUndefined: Self = StObject.set(x, "AccountLastChanged", js.undefined)
    
    inline def setPasswordChangeIndicator(
      value: NoChange | ChangedDuringThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days
    ): Self = StObject.set(x, "PasswordChangeIndicator", value.asInstanceOf[js.Any])
    
    inline def setPasswordChangeIndicatorUndefined: Self = StObject.set(x, "PasswordChangeIndicator", js.undefined)
    
    inline def setPasswordLastChanged(value: js.Date): Self = StObject.set(x, "PasswordLastChanged", value.asInstanceOf[js.Any])
    
    inline def setPasswordLastChangedUndefined: Self = StObject.set(x, "PasswordLastChanged", js.undefined)
    
    inline def setPaymentMethodAdded(value: js.Date): Self = StObject.set(x, "PaymentMethodAdded", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodAddedUndefined: Self = StObject.set(x, "PaymentMethodAdded", js.undefined)
    
    inline def setProvisionAttempts(value: Double): Self = StObject.set(x, "ProvisionAttempts", value.asInstanceOf[js.Any])
    
    inline def setProvisionAttemptsUndefined: Self = StObject.set(x, "ProvisionAttempts", js.undefined)
    
    inline def setPurchasesInTheLast6Months(value: Double): Self = StObject.set(x, "PurchasesInTheLast6Months", value.asInstanceOf[js.Any])
    
    inline def setPurchasesInTheLast6MonthsUndefined: Self = StObject.set(x, "PurchasesInTheLast6Months", js.undefined)
    
    inline def setShippingAddressAdded(value: js.Date): Self = StObject.set(x, "ShippingAddressAdded", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressAddedUndefined: Self = StObject.set(x, "ShippingAddressAdded", js.undefined)
    
    inline def setShippingAddressUsageIndicator(value: ThisTransaction | LessThan30Days | Between30And60Days | MoreThan60Days): Self = StObject.set(x, "ShippingAddressUsageIndicator", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUsageIndicatorUndefined: Self = StObject.set(x, "ShippingAddressUsageIndicator", js.undefined)
    
    inline def setSuspiciousActivityIndicator(value: NoSuspiciousActivityObserved | SuspiciousActivityObserved): Self = StObject.set(x, "SuspiciousActivityIndicator", value.asInstanceOf[js.Any])
    
    inline def setSuspiciousActivityIndicatorUndefined: Self = StObject.set(x, "SuspiciousActivityIndicator", js.undefined)
    
    inline def setTransactionalActivityPerDay(value: Double): Self = StObject.set(x, "TransactionalActivityPerDay", value.asInstanceOf[js.Any])
    
    inline def setTransactionalActivityPerDayUndefined: Self = StObject.set(x, "TransactionalActivityPerDay", js.undefined)
    
    inline def setTransactionalActivityPerYear(value: Double): Self = StObject.set(x, "TransactionalActivityPerYear", value.asInstanceOf[js.Any])
    
    inline def setTransactionalActivityPerYearUndefined: Self = StObject.set(x, "TransactionalActivityPerYear", js.undefined)
  }
}
