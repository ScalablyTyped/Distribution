package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.ActivityTimestamps
import typings.paypalCheckoutServerSdk.paymentsLibMod.LinkDescription
import typings.paypalCheckoutServerSdk.paymentsLibMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order
  extends StObject
     with ActivityTimestamps {
  
  var id: String
  
  var intent: String
  
  var links: js.Array[LinkDescription]
  
  var payer: Payer
  
  var payment_source: PaymentSourceResponse
  
  var purchase_units: js.Array[PurchaseUnit]
  
  var status: Status
}
object Order {
  
  inline def apply(
    create_time: String,
    id: String,
    intent: String,
    links: js.Array[LinkDescription],
    payer: Payer,
    payment_source: PaymentSourceResponse,
    purchase_units: js.Array[PurchaseUnit],
    status: Status,
    update_time: String
  ): Order = {
    val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], payment_source = payment_source.asInstanceOf[js.Any], purchase_units = purchase_units.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setPayer(value: Payer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayment_source(value: PaymentSourceResponse): Self = StObject.set(x, "payment_source", value.asInstanceOf[js.Any])
    
    inline def setPurchase_units(value: js.Array[PurchaseUnit]): Self = StObject.set(x, "purchase_units", value.asInstanceOf[js.Any])
    
    inline def setPurchase_unitsVarargs(value: PurchaseUnit*): Self = StObject.set(x, "purchase_units", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
