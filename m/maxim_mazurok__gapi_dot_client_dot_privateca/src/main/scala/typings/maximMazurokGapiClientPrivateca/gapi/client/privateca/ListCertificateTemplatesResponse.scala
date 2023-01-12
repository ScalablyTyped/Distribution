package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificateTemplatesResponse extends StObject {
  
  /** The list of CertificateTemplates. */
  var certificateTemplates: js.UndefOr[js.Array[CertificateTemplate]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListCertificateTemplatesRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListCertificateTemplatesResponse {
  
  inline def apply(): ListCertificateTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCertificateTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificateTemplates(value: js.Array[CertificateTemplate]): Self = StObject.set(x, "certificateTemplates", value.asInstanceOf[js.Any])
    
    inline def setCertificateTemplatesUndefined: Self = StObject.set(x, "certificateTemplates", js.undefined)
    
    inline def setCertificateTemplatesVarargs(value: CertificateTemplate*): Self = StObject.set(x, "certificateTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
