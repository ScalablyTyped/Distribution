package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate extends StObject {
  
  /** The advertisers to add. */
  var addedAdvertisers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The advertisers to remove. */
  var removedAdvertisers: js.UndefOr[js.Array[String]] = js.undefined
}
object EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate {
  
  inline def apply(): EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate]
  }
  
  extension [Self <: EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate](x: Self) {
    
    inline def setAddedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "addedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setAddedAdvertisersUndefined: Self = StObject.set(x, "addedAdvertisers", js.undefined)
    
    inline def setAddedAdvertisersVarargs(value: String*): Self = StObject.set(x, "addedAdvertisers", js.Array(value*))
    
    inline def setRemovedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "removedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setRemovedAdvertisersUndefined: Self = StObject.set(x, "removedAdvertisers", js.undefined)
    
    inline def setRemovedAdvertisersVarargs(value: String*): Self = StObject.set(x, "removedAdvertisers", js.Array(value*))
  }
}
