package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCaPoolsResponse extends StObject {
  
  /** The list of CaPools. */
  var caPools: js.UndefOr[js.Array[CaPool]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCertificateAuthoritiesRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListCaPoolsResponse {
  
  inline def apply(): ListCaPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCaPoolsResponse]
  }
  
  extension [Self <: ListCaPoolsResponse](x: Self) {
    
    inline def setCaPools(value: js.Array[CaPool]): Self = StObject.set(x, "caPools", value.asInstanceOf[js.Any])
    
    inline def setCaPoolsUndefined: Self = StObject.set(x, "caPools", js.undefined)
    
    inline def setCaPoolsVarargs(value: CaPool*): Self = StObject.set(x, "caPools", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
