package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ExportDocumentsResponse extends StObject {
  
  /** Location of the output files. This can be used to begin an import into Cloud Firestore (this project or another project) after the operation completes successfully. */
  var outputUriPrefix: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ExportDocumentsResponse {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ExportDocumentsResponse]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ExportDocumentsResponseMutableBuilder[Self <: GoogleFirestoreAdminV1ExportDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
