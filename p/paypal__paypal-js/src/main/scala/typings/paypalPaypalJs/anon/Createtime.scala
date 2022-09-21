package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.commonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.paypalPaypalJsStrings.ACTIVE
import typings.paypalPaypalJs.paypalPaypalJsStrings.INACTIVE
import typings.paypalPaypalJs.paypalPaypalJsStrings.IN_PROGRESS
import typings.paypalPaypalJs.paypalPaypalJsStrings.TIERED
import typings.paypalPaypalJs.paypalPaypalJsStrings.VOLUME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createtime extends StObject {
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var create_time: String
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var fixed_price: AmountWithCurrencyCode
  
  /** The pricing model for tiered plan. The `tiers` parameter is required. */
  var pricing_model: VOLUME | TIERED
  
  /** The status of the pricing scheme. */
  var status: IN_PROGRESS | ACTIVE | INACTIVE
  
  /** An array of pricing tiers which are used for billing volume/tiered plans. pricing_model field has to be specified. */
  var tiers: js.Array[Endingquantity]
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var update_time: String
  
  /** The version of the pricing scheme. */
  var version: Double
}
object Createtime {
  
  inline def apply(
    create_time: String,
    fixed_price: AmountWithCurrencyCode,
    pricing_model: VOLUME | TIERED,
    status: IN_PROGRESS | ACTIVE | INACTIVE,
    tiers: js.Array[Endingquantity],
    update_time: String,
    version: Double
  ): Createtime = {
    val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], fixed_price = fixed_price.asInstanceOf[js.Any], pricing_model = pricing_model.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tiers = tiers.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createtime]
  }
  
  extension [Self <: Createtime](x: Self) {
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setFixed_price(value: AmountWithCurrencyCode): Self = StObject.set(x, "fixed_price", value.asInstanceOf[js.Any])
    
    inline def setPricing_model(value: VOLUME | TIERED): Self = StObject.set(x, "pricing_model", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: IN_PROGRESS | ACTIVE | INACTIVE): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTiers(value: js.Array[Endingquantity]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersVarargs(value: Endingquantity*): Self = StObject.set(x, "tiers", js.Array(value*))
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
