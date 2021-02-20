package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WmxSite extends StObject {
  
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[String] = js.native
  
  /** The URL of the site. */
  var siteUrl: js.UndefOr[String] = js.native
}
object WmxSite {
  
  @scala.inline
  def apply(): WmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSite]
  }
  
  @scala.inline
  implicit class WmxSiteMutableBuilder[Self <: WmxSite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
