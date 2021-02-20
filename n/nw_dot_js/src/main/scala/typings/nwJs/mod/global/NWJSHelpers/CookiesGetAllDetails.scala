package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.getAll() details argument object
  */
@js.native
trait CookiesGetAllDetails extends StObject {
  
  /**
    * Restricts the retrieved cookies to those whose domains match or are subdomains of this one.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Filters the cookies by name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Restricts the retrieved cookies to those whose path exactly matches this string.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Filters the cookies by their Secure property.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Filters out session vs. persistent cookies.
    */
  var session: Boolean = js.native
  
  /**
    * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.
    */
  var storeId: js.UndefOr[String] = js.native
  
  /**
    * Restricts the retrieved cookies to those that would match the given URL.
    */
  var url: js.UndefOr[String] = js.native
}
object CookiesGetAllDetails {
  
  @scala.inline
  def apply(session: Boolean): CookiesGetAllDetails = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesGetAllDetails]
  }
  
  @scala.inline
  implicit class CookiesGetAllDetailsMutableBuilder[Self <: CookiesGetAllDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
