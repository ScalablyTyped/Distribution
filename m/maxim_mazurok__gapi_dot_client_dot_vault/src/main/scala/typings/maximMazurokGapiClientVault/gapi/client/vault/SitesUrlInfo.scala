package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitesUrlInfo extends StObject {
  
  /** A list of published site URLs. */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object SitesUrlInfo {
  
  inline def apply(): SitesUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitesUrlInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SitesUrlInfo] (val x: Self) extends AnyVal {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
