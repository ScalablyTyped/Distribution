package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.get() details argument object
  */
@js.native
trait CookiesGetDetails extends StObject {
  
  /**
    * The name of the cookie to retrieve.
    */
  var name: String = js.native
  
  /**
    * The ID of the cookie store in which to look for the cookie.
    */
  var storeId: String = js.native
  
  /**
    * The URL with which the cookie to retrieve is associated.
    */
  var url: String = js.native
}
object CookiesGetDetails {
  
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesGetDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesGetDetails]
  }
  
  @scala.inline
  implicit class CookiesGetDetailsMutableBuilder[Self <: CookiesGetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
