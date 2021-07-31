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
  
  @scala.inline
  def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  
  @scala.inline
  implicit class ListCertificateAuthoritiesResponseMutableBuilder[Self <: ListCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "certificateAuthorities", js.undefined)
    
    @scala.inline
    def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "certificateAuthorities", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
