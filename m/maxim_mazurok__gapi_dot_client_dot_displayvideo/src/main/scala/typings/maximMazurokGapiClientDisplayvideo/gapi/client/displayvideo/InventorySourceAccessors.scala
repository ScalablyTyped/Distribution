package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceAccessors extends StObject {
  
  /** The advertisers with access to the inventory source. All advertisers must belong to the same partner. */
  var advertisers: js.UndefOr[InventorySourceAccessorsAdvertiserAccessors] = js.undefined
  
  /** The partner with access to the inventory source. */
  var partner: js.UndefOr[InventorySourceAccessorsPartnerAccessor] = js.undefined
}
object InventorySourceAccessors {
  
  inline def apply(): InventorySourceAccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAccessors]
  }
  
  extension [Self <: InventorySourceAccessors](x: Self) {
    
    inline def setAdvertisers(value: InventorySourceAccessorsAdvertiserAccessors): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    inline def setPartner(value: InventorySourceAccessorsPartnerAccessor): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
  }
}
