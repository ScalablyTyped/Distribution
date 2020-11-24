package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificateRevocationListsResponse extends js.Object {
  
  /** The list of CertificateRevocationLists. */
  var certificateRevocationLists: js.UndefOr[js.Array[CertificateRevocationList]] = js.native
  
  /** A token to retrieve next page of results. Pass this value in ListCertificateRevocationListsRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListCertificateRevocationListsResponse {
  
  @scala.inline
  def apply(): ListCertificateRevocationListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateRevocationListsResponse]
  }
  
  @scala.inline
  implicit class ListCertificateRevocationListsResponseOps[Self <: ListCertificateRevocationListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateRevocationListsVarargs(value: CertificateRevocationList*): Self = this.set("certificateRevocationLists", js.Array(value :_*))
    
    @scala.inline
    def setCertificateRevocationLists(value: js.Array[CertificateRevocationList]): Self = this.set("certificateRevocationLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateRevocationLists: Self = this.set("certificateRevocationLists", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
