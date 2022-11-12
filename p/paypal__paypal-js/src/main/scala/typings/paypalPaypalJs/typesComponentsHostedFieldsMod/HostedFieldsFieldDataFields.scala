package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @paypal/paypal-js.@paypal/paypal-js/types/components/hosted-fields.HostedFieldsHostedFieldsFieldName ]: @paypal/paypal-js.@paypal/paypal-js/types/components/hosted-fields.HostedFieldsHostedFieldsFieldData} */
trait HostedFieldsFieldDataFields extends StObject {
  
  var cardholderName: HostedFieldsHostedFieldsFieldData
  
  var cvv: HostedFieldsHostedFieldsFieldData
  
  var expirationDate: HostedFieldsHostedFieldsFieldData
  
  var expirationMonth: HostedFieldsHostedFieldsFieldData
  
  var expirationYear: HostedFieldsHostedFieldsFieldData
  
  var number: HostedFieldsHostedFieldsFieldData
  
  var postalCode: HostedFieldsHostedFieldsFieldData
}
object HostedFieldsFieldDataFields {
  
  inline def apply(
    cardholderName: HostedFieldsHostedFieldsFieldData,
    cvv: HostedFieldsHostedFieldsFieldData,
    expirationDate: HostedFieldsHostedFieldsFieldData,
    expirationMonth: HostedFieldsHostedFieldsFieldData,
    expirationYear: HostedFieldsHostedFieldsFieldData,
    number: HostedFieldsHostedFieldsFieldData,
    postalCode: HostedFieldsHostedFieldsFieldData
  ): HostedFieldsFieldDataFields = {
    val __obj = js.Dynamic.literal(cardholderName = cardholderName.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsFieldDataFields]
  }
  
  extension [Self <: HostedFieldsFieldDataFields](x: Self) {
    
    inline def setCardholderName(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCvv(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonth(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationYear(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
