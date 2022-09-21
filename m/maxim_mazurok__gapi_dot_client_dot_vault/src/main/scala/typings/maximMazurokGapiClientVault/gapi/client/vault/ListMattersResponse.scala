package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMattersResponse extends StObject {
  
  /** List of matters. */
  var matters: js.UndefOr[js.Array[Matter]] = js.undefined
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMattersResponse {
  
  inline def apply(): ListMattersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMattersResponse]
  }
  
  extension [Self <: ListMattersResponse](x: Self) {
    
    inline def setMatters(value: js.Array[Matter]): Self = StObject.set(x, "matters", value.asInstanceOf[js.Any])
    
    inline def setMattersUndefined: Self = StObject.set(x, "matters", js.undefined)
    
    inline def setMattersVarargs(value: Matter*): Self = StObject.set(x, "matters", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
