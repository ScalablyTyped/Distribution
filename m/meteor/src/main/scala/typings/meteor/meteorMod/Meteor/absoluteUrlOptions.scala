package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait absoluteUrlOptions extends StObject {
  
  /** Replace localhost with 127.0.0.1. Useful for services that don't recognize localhost as a domain name. */
  var replaceLocalhost: js.UndefOr[Boolean] = js.undefined
  
  /** Override the default ROOT_URL from the server environment. For example: "`http://foo.example.com`" */
  var rootUrl: js.UndefOr[String] = js.undefined
  
  /** Create an HTTPS URL. */
  var secure: js.UndefOr[Boolean] = js.undefined
}
object absoluteUrlOptions {
  
  inline def apply(): absoluteUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[absoluteUrlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: absoluteUrlOptions] (val x: Self) extends AnyVal {
    
    inline def setReplaceLocalhost(value: Boolean): Self = StObject.set(x, "replaceLocalhost", value.asInstanceOf[js.Any])
    
    inline def setReplaceLocalhostUndefined: Self = StObject.set(x, "replaceLocalhost", js.undefined)
    
    inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
    
    inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
