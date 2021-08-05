package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessDeniedPageSettings extends StObject {
  
  /** The URI to be redirected to when access is denied. */
  var accessDeniedPageUri: js.UndefOr[String] = js.undefined
}
object AccessDeniedPageSettings {
  
  inline def apply(): AccessDeniedPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDeniedPageSettings]
  }
  
  extension [Self <: AccessDeniedPageSettings](x: Self) {
    
    inline def setAccessDeniedPageUri(value: String): Self = StObject.set(x, "accessDeniedPageUri", value.asInstanceOf[js.Any])
    
    inline def setAccessDeniedPageUriUndefined: Self = StObject.set(x, "accessDeniedPageUri", js.undefined)
  }
}
