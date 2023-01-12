package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitesListResponse extends StObject {
  
  /** Contains permission level information about a Search Console site. For more information, see [Permissions in Search Console](https://support.google.com/webmasters/answer/2451999). */
  var siteEntry: js.UndefOr[js.Array[WmxSite]] = js.undefined
}
object SitesListResponse {
  
  inline def apply(): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SitesListResponse] (val x: Self) extends AnyVal {
    
    inline def setSiteEntry(value: js.Array[WmxSite]): Self = StObject.set(x, "siteEntry", value.asInstanceOf[js.Any])
    
    inline def setSiteEntryUndefined: Self = StObject.set(x, "siteEntry", js.undefined)
    
    inline def setSiteEntryVarargs(value: WmxSite*): Self = StObject.set(x, "siteEntry", js.Array(value*))
  }
}
