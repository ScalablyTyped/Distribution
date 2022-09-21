package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceAccessorsPartnerAccessor extends StObject {
  
  /** The ID of the partner. */
  var partnerId: js.UndefOr[String] = js.undefined
}
object InventorySourceAccessorsPartnerAccessor {
  
  inline def apply(): InventorySourceAccessorsPartnerAccessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAccessorsPartnerAccessor]
  }
  
  extension [Self <: InventorySourceAccessorsPartnerAccessor](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
