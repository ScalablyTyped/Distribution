package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsResponse extends StObject {
  
  /** The list of exports. */
  var exports: js.UndefOr[js.Array[Export]] = js.undefined
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListExportsResponse {
  
  inline def apply(): ListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsResponse]
  }
  
  extension [Self <: ListExportsResponse](x: Self) {
    
    inline def setExports(value: js.Array[Export]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: Export*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
