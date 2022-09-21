package typings.maximMazurokGapiClientReseller.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLegacySkuId extends StObject {
  
  /**
    * The `skuId` of the current resold subscription. This is populated only when the customer has a subscription with a legacy SKU and the subscription resource is populated with the
    * `skuId` of the SKU recommended for the transfer.
    */
  var currentLegacySkuId: js.UndefOr[String] = js.undefined
  
  /**
    * When inserting a subscription, this is the minimum number of seats listed in the transfer order for this product. For example, if the customer has 20 users, the reseller cannot
    * place a transfer order of 15 seats. The minimum is 20 seats.
    */
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  
  /** The time when transfer token or intent to transfer will expire. The time is in milliseconds using UNIX Epoch format. */
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}
object CurrentLegacySkuId {
  
  inline def apply(): CurrentLegacySkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentLegacySkuId]
  }
  
  extension [Self <: CurrentLegacySkuId](x: Self) {
    
    inline def setCurrentLegacySkuId(value: String): Self = StObject.set(x, "currentLegacySkuId", value.asInstanceOf[js.Any])
    
    inline def setCurrentLegacySkuIdUndefined: Self = StObject.set(x, "currentLegacySkuId", js.undefined)
    
    inline def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
    
    inline def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
    
    inline def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
  }
}
