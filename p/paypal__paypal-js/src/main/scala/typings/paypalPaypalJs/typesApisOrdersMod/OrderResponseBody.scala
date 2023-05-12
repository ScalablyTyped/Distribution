package typings.paypalPaypalJs.typesApisOrdersMod

import org.scalablytyped.runtime.StringDictionary
import typings.paypalPaypalJs.anon.PartialPayer
import typings.paypalPaypalJs.anon.PartialissuerPaypalCARDIS
import typings.paypalPaypalJs.paypalPaypalJsStrings.APPROVED
import typings.paypalPaypalJs.paypalPaypalJsStrings.COMPLETED
import typings.paypalPaypalJs.paypalPaypalJsStrings.CREATED
import typings.paypalPaypalJs.paypalPaypalJsStrings.PAYER_ACTION_REQUIRED
import typings.paypalPaypalJs.paypalPaypalJsStrings.SAVED
import typings.paypalPaypalJs.paypalPaypalJsStrings.VOIDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderResponseBody
  extends StObject
     with OrderResponseBodyMinimal {
  
  /**
    * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
    * Seconds are required while fractional seconds are optional
    * @minLength 20
    * @maxLength 64
    */
  var create_time: String
  
  /**
    * The details about the payer-selected credit financing offer
    */
  var credit_financing_offer: js.UndefOr[PartialissuerPaypalCARDIS] = js.undefined
  
  /**
    * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
    * Seconds are required while fractional seconds are optional
    */
  var expiration_time: js.UndefOr[String] = js.undefined
  
  /**
    * @type {INTENT}
    */
  var intent: INTENT
  
  /**
    * @type {Payer}
    */
  var payer: PartialPayer
  
  /**
    * The payment source used to fund the payment
    */
  var payment_source: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * The instruction to process an order
    */
  var processing_instruction: js.UndefOr[String] = js.undefined
  
  var purchase_units: js.Array[PurchaseUnit]
  
  /**
    * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
    * Seconds are required while fractional seconds are optional
    * @minLength 20
    * @maxLength 64
    */
  var update_time: String
}
object OrderResponseBody {
  
  inline def apply(
    create_time: String,
    id: String,
    intent: INTENT,
    links: js.Array[LinkDescription],
    payer: PartialPayer,
    purchase_units: js.Array[PurchaseUnit],
    status: CREATED | SAVED | APPROVED | VOIDED | COMPLETED | PAYER_ACTION_REQUIRED,
    update_time: String
  ): OrderResponseBody = {
    val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], purchase_units = purchase_units.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderResponseBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderResponseBody] (val x: Self) extends AnyVal {
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCredit_financing_offer(value: PartialissuerPaypalCARDIS): Self = StObject.set(x, "credit_financing_offer", value.asInstanceOf[js.Any])
    
    inline def setCredit_financing_offerUndefined: Self = StObject.set(x, "credit_financing_offer", js.undefined)
    
    inline def setExpiration_time(value: String): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
    
    inline def setExpiration_timeUndefined: Self = StObject.set(x, "expiration_time", js.undefined)
    
    inline def setIntent(value: INTENT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setPayer(value: PartialPayer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayment_source(value: StringDictionary[Any]): Self = StObject.set(x, "payment_source", value.asInstanceOf[js.Any])
    
    inline def setPayment_sourceUndefined: Self = StObject.set(x, "payment_source", js.undefined)
    
    inline def setProcessing_instruction(value: String): Self = StObject.set(x, "processing_instruction", value.asInstanceOf[js.Any])
    
    inline def setProcessing_instructionUndefined: Self = StObject.set(x, "processing_instruction", js.undefined)
    
    inline def setPurchase_units(value: js.Array[PurchaseUnit]): Self = StObject.set(x, "purchase_units", value.asInstanceOf[js.Any])
    
    inline def setPurchase_unitsVarargs(value: PurchaseUnit*): Self = StObject.set(x, "purchase_units", js.Array(value*))
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
  }
}
