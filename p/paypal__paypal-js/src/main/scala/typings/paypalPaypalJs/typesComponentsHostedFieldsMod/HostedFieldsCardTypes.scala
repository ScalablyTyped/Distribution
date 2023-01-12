package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @paypal/paypal-js.@paypal/paypal-js/types/components/hosted-fields.HostedFieldsCardTypeName ]: @paypal/paypal-js.@paypal/paypal-js/types/components/hosted-fields.HostedFieldsCardTypeData} */
trait HostedFieldsCardTypes extends StObject {
  
  var amex: HostedFieldsCardTypeData
  
  var discover: HostedFieldsCardTypeData
  
  var elo: HostedFieldsCardTypeData
  
  var hiper: HostedFieldsCardTypeData
  
  var jcb: HostedFieldsCardTypeData
  
  var mastercard: HostedFieldsCardTypeData
  
  var visa: HostedFieldsCardTypeData
}
object HostedFieldsCardTypes {
  
  inline def apply(
    amex: HostedFieldsCardTypeData,
    discover: HostedFieldsCardTypeData,
    elo: HostedFieldsCardTypeData,
    hiper: HostedFieldsCardTypeData,
    jcb: HostedFieldsCardTypeData,
    mastercard: HostedFieldsCardTypeData,
    visa: HostedFieldsCardTypeData
  ): HostedFieldsCardTypes = {
    val __obj = js.Dynamic.literal(amex = amex.asInstanceOf[js.Any], discover = discover.asInstanceOf[js.Any], elo = elo.asInstanceOf[js.Any], hiper = hiper.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mastercard = mastercard.asInstanceOf[js.Any], visa = visa.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsCardTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsCardTypes] (val x: Self) extends AnyVal {
    
    inline def setAmex(value: HostedFieldsCardTypeData): Self = StObject.set(x, "amex", value.asInstanceOf[js.Any])
    
    inline def setDiscover(value: HostedFieldsCardTypeData): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setElo(value: HostedFieldsCardTypeData): Self = StObject.set(x, "elo", value.asInstanceOf[js.Any])
    
    inline def setHiper(value: HostedFieldsCardTypeData): Self = StObject.set(x, "hiper", value.asInstanceOf[js.Any])
    
    inline def setJcb(value: HostedFieldsCardTypeData): Self = StObject.set(x, "jcb", value.asInstanceOf[js.Any])
    
    inline def setMastercard(value: HostedFieldsCardTypeData): Self = StObject.set(x, "mastercard", value.asInstanceOf[js.Any])
    
    inline def setVisa(value: HostedFieldsCardTypeData): Self = StObject.set(x, "visa", value.asInstanceOf[js.Any])
  }
}
