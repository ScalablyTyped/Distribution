package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInfo extends StObject {
  
  /** Name of a Compute Engine network. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The IP range that matches the test. */
  var matchedIpRange: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine network. */
  var uri: js.UndefOr[String] = js.undefined
}
object NetworkInfo {
  
  inline def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  extension [Self <: NetworkInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMatchedIpRange(value: String): Self = StObject.set(x, "matchedIpRange", value.asInstanceOf[js.Any])
    
    inline def setMatchedIpRangeUndefined: Self = StObject.set(x, "matchedIpRange", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
