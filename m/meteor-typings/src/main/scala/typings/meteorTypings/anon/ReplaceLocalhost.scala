package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceLocalhost extends StObject {
  
  var replaceLocalhost: js.UndefOr[Boolean] = js.undefined
  
  var rootUrl: js.UndefOr[String] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
}
object ReplaceLocalhost {
  
  inline def apply(): ReplaceLocalhost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceLocalhost]
  }
  
  extension [Self <: ReplaceLocalhost](x: Self) {
    
    inline def setReplaceLocalhost(value: Boolean): Self = StObject.set(x, "replaceLocalhost", value.asInstanceOf[js.Any])
    
    inline def setReplaceLocalhostUndefined: Self = StObject.set(x, "replaceLocalhost", js.undefined)
    
    inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
    
    inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
