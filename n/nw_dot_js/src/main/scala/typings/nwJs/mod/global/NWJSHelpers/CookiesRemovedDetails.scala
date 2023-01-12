package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.remove() callback details argument object
  */
trait CookiesRemovedDetails extends StObject {
  
  /**
    * The name of the cookie that's been removed.
    */
  var name: String
  
  /**
    * The ID of the cookie store from which the cookie was removed.
    */
  var storeId: String
  
  /**
    * The URL associated with the cookie that's been removed.
    */
  var url: String
}
object CookiesRemovedDetails {
  
  inline def apply(name: String, storeId: String, url: String): CookiesRemovedDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesRemovedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookiesRemovedDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
