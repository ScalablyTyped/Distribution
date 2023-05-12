package typings.mercadopagoSdkJs.cardform

import typings.mercadopagoSdkJs.shared.Issuer
import typings.mercadopagoSdkJs.shared.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodsResponseCardForm extends StObject {
  
  var additional_info_needed: js.Array[String]
  
  var agreements: js.Array[Any]
  
  var deferred_capture: String
  
  var id: String
  
  var issuer: Issuer
  
  var labels: js.Array[String]
  
  var marketplace: String
  
  var merchant_account_id: String
  
  var name: String
  
  var payment_type_id: String
  
  var processing_mode: String
  
  var settings: js.Array[Setting]
  
  var site_id: String
  
  var status: String
  
  var thumbnail: String
}
object PaymentMethodsResponseCardForm {
  
  inline def apply(
    additional_info_needed: js.Array[String],
    agreements: js.Array[Any],
    deferred_capture: String,
    id: String,
    issuer: Issuer,
    labels: js.Array[String],
    marketplace: String,
    merchant_account_id: String,
    name: String,
    payment_type_id: String,
    processing_mode: String,
    settings: js.Array[Setting],
    site_id: String,
    status: String,
    thumbnail: String
  ): PaymentMethodsResponseCardForm = {
    val __obj = js.Dynamic.literal(additional_info_needed = additional_info_needed.asInstanceOf[js.Any], agreements = agreements.asInstanceOf[js.Any], deferred_capture = deferred_capture.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], marketplace = marketplace.asInstanceOf[js.Any], merchant_account_id = merchant_account_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payment_type_id = payment_type_id.asInstanceOf[js.Any], processing_mode = processing_mode.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], site_id = site_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodsResponseCardForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodsResponseCardForm] (val x: Self) extends AnyVal {
    
    inline def setAdditional_info_needed(value: js.Array[String]): Self = StObject.set(x, "additional_info_needed", value.asInstanceOf[js.Any])
    
    inline def setAdditional_info_neededVarargs(value: String*): Self = StObject.set(x, "additional_info_needed", js.Array(value*))
    
    inline def setAgreements(value: js.Array[Any]): Self = StObject.set(x, "agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsVarargs(value: Any*): Self = StObject.set(x, "agreements", js.Array(value*))
    
    inline def setDeferred_capture(value: String): Self = StObject.set(x, "deferred_capture", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMarketplace(value: String): Self = StObject.set(x, "marketplace", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_id(value: String): Self = StObject.set(x, "merchant_account_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPayment_type_id(value: String): Self = StObject.set(x, "payment_type_id", value.asInstanceOf[js.Any])
    
    inline def setProcessing_mode(value: String): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Array[Setting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setSite_id(value: String): Self = StObject.set(x, "site_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
