package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WmxSite extends StObject {
  
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[String] = js.undefined
  
  /** The URL of the site. */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object WmxSite {
  
  inline def apply(): WmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSite]
  }
  
  extension [Self <: WmxSite](x: Self) {
    
    inline def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
    
    inline def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
