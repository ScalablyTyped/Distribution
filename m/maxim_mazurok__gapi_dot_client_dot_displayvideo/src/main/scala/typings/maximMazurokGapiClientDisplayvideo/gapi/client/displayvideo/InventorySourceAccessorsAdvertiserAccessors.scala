package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceAccessorsAdvertiserAccessors extends StObject {
  
  /** The IDs of the advertisers. */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object InventorySourceAccessorsAdvertiserAccessors {
  
  inline def apply(): InventorySourceAccessorsAdvertiserAccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAccessorsAdvertiserAccessors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventorySourceAccessorsAdvertiserAccessors] (val x: Self) extends AnyVal {
    
    inline def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    inline def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value*))
  }
}
