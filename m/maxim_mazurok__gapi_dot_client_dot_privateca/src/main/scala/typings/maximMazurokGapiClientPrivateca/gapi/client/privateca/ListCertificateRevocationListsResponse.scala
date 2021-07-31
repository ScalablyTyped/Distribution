package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificateRevocationListsResponse extends StObject {
  
  /** The list of CertificateRevocationLists. */
  var certificateRevocationLists: js.UndefOr[js.Array[CertificateRevocationList]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCertificateRevocationListsRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListCertificateRevocationListsResponse {
  
  @scala.inline
  def apply(): ListCertificateRevocationListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateRevocationListsResponse]
  }
  
  @scala.inline
  implicit class ListCertificateRevocationListsResponseMutableBuilder[Self <: ListCertificateRevocationListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateRevocationLists(value: js.Array[CertificateRevocationList]): Self = StObject.set(x, "certificateRevocationLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateRevocationListsUndefined: Self = StObject.set(x, "certificateRevocationLists", js.undefined)
    
    @scala.inline
    def setCertificateRevocationListsVarargs(value: CertificateRevocationList*): Self = StObject.set(x, "certificateRevocationLists", js.Array(value :_*))
    
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
