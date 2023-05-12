package typings.mercadopagoSdkJs.mercadopagocore

import typings.mercadopagoSdkJs.shared.Issuer
import typings.mercadopagoSdkJs.shared.PayerCost
import typings.mercadopagoSdkJs.shared.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var accreditation_time: Double
  
  var additional_info_needed: js.Array[String]
  
  var agreements: js.Array[Any]
  
  var bins: js.Array[Any]
  
  var deferred_capture: String
  
  var financial_institutions: js.Array[Any]
  
  var financing_deals: FinancingDeals
  
  var id: String
  
  var issuer: Issuer
  
  var labels: js.Array[String]
  
  var marketplace: String
  
  var max_accreditation_days: Double
  
  var merchant_account_id: String
  
  var min_accreditation_days: Double
  
  var name: String
  
  var payer_costs: js.Array[PayerCost]
  
  var payment_type_id: String
  
  var processing_mode: String
  
  var secure_thumbnail: String
  
  var settings: js.Array[Setting]
  
  var site_id: String
  
  var status: String
  
  var thumbnail: String
  
  var total_financial_cost: js.UndefOr[Any] = js.undefined
}
object Result {
  
  inline def apply(
    accreditation_time: Double,
    additional_info_needed: js.Array[String],
    agreements: js.Array[Any],
    bins: js.Array[Any],
    deferred_capture: String,
    financial_institutions: js.Array[Any],
    financing_deals: FinancingDeals,
    id: String,
    issuer: Issuer,
    labels: js.Array[String],
    marketplace: String,
    max_accreditation_days: Double,
    merchant_account_id: String,
    min_accreditation_days: Double,
    name: String,
    payer_costs: js.Array[PayerCost],
    payment_type_id: String,
    processing_mode: String,
    secure_thumbnail: String,
    settings: js.Array[Setting],
    site_id: String,
    status: String,
    thumbnail: String
  ): Result = {
    val __obj = js.Dynamic.literal(accreditation_time = accreditation_time.asInstanceOf[js.Any], additional_info_needed = additional_info_needed.asInstanceOf[js.Any], agreements = agreements.asInstanceOf[js.Any], bins = bins.asInstanceOf[js.Any], deferred_capture = deferred_capture.asInstanceOf[js.Any], financial_institutions = financial_institutions.asInstanceOf[js.Any], financing_deals = financing_deals.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], marketplace = marketplace.asInstanceOf[js.Any], max_accreditation_days = max_accreditation_days.asInstanceOf[js.Any], merchant_account_id = merchant_account_id.asInstanceOf[js.Any], min_accreditation_days = min_accreditation_days.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payer_costs = payer_costs.asInstanceOf[js.Any], payment_type_id = payment_type_id.asInstanceOf[js.Any], processing_mode = processing_mode.asInstanceOf[js.Any], secure_thumbnail = secure_thumbnail.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], site_id = site_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setAccreditation_time(value: Double): Self = StObject.set(x, "accreditation_time", value.asInstanceOf[js.Any])
    
    inline def setAdditional_info_needed(value: js.Array[String]): Self = StObject.set(x, "additional_info_needed", value.asInstanceOf[js.Any])
    
    inline def setAdditional_info_neededVarargs(value: String*): Self = StObject.set(x, "additional_info_needed", js.Array(value*))
    
    inline def setAgreements(value: js.Array[Any]): Self = StObject.set(x, "agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsVarargs(value: Any*): Self = StObject.set(x, "agreements", js.Array(value*))
    
    inline def setBins(value: js.Array[Any]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsVarargs(value: Any*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setDeferred_capture(value: String): Self = StObject.set(x, "deferred_capture", value.asInstanceOf[js.Any])
    
    inline def setFinancial_institutions(value: js.Array[Any]): Self = StObject.set(x, "financial_institutions", value.asInstanceOf[js.Any])
    
    inline def setFinancial_institutionsVarargs(value: Any*): Self = StObject.set(x, "financial_institutions", js.Array(value*))
    
    inline def setFinancing_deals(value: FinancingDeals): Self = StObject.set(x, "financing_deals", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMarketplace(value: String): Self = StObject.set(x, "marketplace", value.asInstanceOf[js.Any])
    
    inline def setMax_accreditation_days(value: Double): Self = StObject.set(x, "max_accreditation_days", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_id(value: String): Self = StObject.set(x, "merchant_account_id", value.asInstanceOf[js.Any])
    
    inline def setMin_accreditation_days(value: Double): Self = StObject.set(x, "min_accreditation_days", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPayer_costs(value: js.Array[PayerCost]): Self = StObject.set(x, "payer_costs", value.asInstanceOf[js.Any])
    
    inline def setPayer_costsVarargs(value: PayerCost*): Self = StObject.set(x, "payer_costs", js.Array(value*))
    
    inline def setPayment_type_id(value: String): Self = StObject.set(x, "payment_type_id", value.asInstanceOf[js.Any])
    
    inline def setProcessing_mode(value: String): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
    
    inline def setSecure_thumbnail(value: String): Self = StObject.set(x, "secure_thumbnail", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Array[Setting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setSite_id(value: String): Self = StObject.set(x, "site_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTotal_financial_cost(value: Any): Self = StObject.set(x, "total_financial_cost", value.asInstanceOf[js.Any])
    
    inline def setTotal_financial_costUndefined: Self = StObject.set(x, "total_financial_cost", js.undefined)
  }
}
