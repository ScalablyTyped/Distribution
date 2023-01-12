package typings.oidcProvider.mod

import typings.oidcProvider.oidcProviderStrings.lax
import typings.oidcProvider.oidcProviderStrings.none
import typings.oidcProvider.oidcProviderStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesSetOptions extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var sameSite: js.UndefOr[strict | lax | none] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var signed: js.UndefOr[Boolean] = js.undefined
}
object CookiesSetOptions {
  
  inline def apply(): CookiesSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookiesSetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookiesSetOptions] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: strict | lax | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
  }
}
