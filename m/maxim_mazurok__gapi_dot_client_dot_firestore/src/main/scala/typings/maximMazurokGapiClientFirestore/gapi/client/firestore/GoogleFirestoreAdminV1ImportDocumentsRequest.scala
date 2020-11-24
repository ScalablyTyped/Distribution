package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ImportDocumentsRequest extends js.Object {
  
  /** Which collection ids to import. Unspecified means all collections included in the import. */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Location of the exported files. This must match the output_uri_prefix of an ExportDocumentsResponse from an export that has completed successfully. See:
    * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
    */
  var inputUriPrefix: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ImportDocumentsRequest {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ImportDocumentsRequest]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ImportDocumentsRequestOps[Self <: GoogleFirestoreAdminV1ImportDocumentsRequest] (val x: Self) extends AnyVal {
    
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
    def setCollectionIdsVarargs(value: String*): Self = this.set("collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = this.set("collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionIds: Self = this.set("collectionIds", js.undefined)
    
    @scala.inline
    def setInputUriPrefix(value: String): Self = this.set("inputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUriPrefix: Self = this.set("inputUriPrefix", js.undefined)
  }
}
