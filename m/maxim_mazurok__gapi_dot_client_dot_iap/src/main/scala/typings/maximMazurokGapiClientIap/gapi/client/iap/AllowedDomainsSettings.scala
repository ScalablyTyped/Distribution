package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedDomainsSettings extends StObject {
  
  /** List of trusted domains. */
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Configuration for customers to opt in for the feature. */
  var enable: js.UndefOr[Boolean] = js.undefined
}
object AllowedDomainsSettings {
  
  inline def apply(): AllowedDomainsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedDomainsSettings]
  }
  
  extension [Self <: AllowedDomainsSettings](x: Self) {
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
