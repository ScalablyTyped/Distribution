package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyInventoryFilter extends StObject {
  
  /** Required. The OS short name */
  var osShortName: js.UndefOr[String] = js.undefined
  
  /**
    * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following
    * value for this field `7.*` An empty string matches all OS versions.
    */
  var osVersion: js.UndefOr[String] = js.undefined
}
object OSPolicyInventoryFilter {
  
  inline def apply(): OSPolicyInventoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyInventoryFilter]
  }
  
  extension [Self <: OSPolicyInventoryFilter](x: Self) {
    
    inline def setOsShortName(value: String): Self = StObject.set(x, "osShortName", value.asInstanceOf[js.Any])
    
    inline def setOsShortNameUndefined: Self = StObject.set(x, "osShortName", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
  }
}
