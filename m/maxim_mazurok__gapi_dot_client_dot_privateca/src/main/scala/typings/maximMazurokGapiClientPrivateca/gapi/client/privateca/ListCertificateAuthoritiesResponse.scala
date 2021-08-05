package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificateAuthoritiesResponse extends StObject {
  
  /** The list of CertificateAuthorities. */
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCertificateAuthoritiesRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListCertificateAuthoritiesResponse {
  
  inline def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  
  extension [Self <: ListCertificateAuthoritiesResponse](x: Self) {
    
    inline def setCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "certificateAuthorities", js.undefined)
    
    inline def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "certificateAuthorities", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
