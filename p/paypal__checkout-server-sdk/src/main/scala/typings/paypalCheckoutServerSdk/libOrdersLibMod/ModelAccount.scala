package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelAccount extends StObject {
  
  var account_id: String
  
  var account_number: String
  
  var account_tags: js.Array[String]
  
  var legal_country_code: String
  
  var legal_entity: String
  
  var pricing_category: String
  
  var registration_type: String
  
  var status: Status
  
  var tier: Tier
  
  var time_created: String
}
object ModelAccount {
  
  inline def apply(
    account_id: String,
    account_number: String,
    account_tags: js.Array[String],
    legal_country_code: String,
    legal_entity: String,
    pricing_category: String,
    registration_type: String,
    status: Status,
    tier: Tier,
    time_created: String
  ): ModelAccount = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], account_tags = account_tags.asInstanceOf[js.Any], legal_country_code = legal_country_code.asInstanceOf[js.Any], legal_entity = legal_entity.asInstanceOf[js.Any], pricing_category = pricing_category.asInstanceOf[js.Any], registration_type = registration_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any], time_created = time_created.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAccount]
  }
  
  extension [Self <: ModelAccount](x: Self) {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAccount_tags(value: js.Array[String]): Self = StObject.set(x, "account_tags", value.asInstanceOf[js.Any])
    
    inline def setAccount_tagsVarargs(value: String*): Self = StObject.set(x, "account_tags", js.Array(value*))
    
    inline def setLegal_country_code(value: String): Self = StObject.set(x, "legal_country_code", value.asInstanceOf[js.Any])
    
    inline def setLegal_entity(value: String): Self = StObject.set(x, "legal_entity", value.asInstanceOf[js.Any])
    
    inline def setPricing_category(value: String): Self = StObject.set(x, "pricing_category", value.asInstanceOf[js.Any])
    
    inline def setRegistration_type(value: String): Self = StObject.set(x, "registration_type", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Tier): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTime_created(value: String): Self = StObject.set(x, "time_created", value.asInstanceOf[js.Any])
  }
}
