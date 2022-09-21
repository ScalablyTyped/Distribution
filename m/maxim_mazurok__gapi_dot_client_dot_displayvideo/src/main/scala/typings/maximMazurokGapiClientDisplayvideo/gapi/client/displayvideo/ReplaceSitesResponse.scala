package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceSitesResponse extends StObject {
  
  /** The list of sites in the channel after replacing. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}
object ReplaceSitesResponse {
  
  inline def apply(): ReplaceSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceSitesResponse]
  }
  
  extension [Self <: ReplaceSitesResponse](x: Self) {
    
    inline def setSites(value: js.Array[Site]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
