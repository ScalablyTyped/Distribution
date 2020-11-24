package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ListFieldsResponse extends js.Object {
  
  /** The requested fields. */
  var fields: js.UndefOr[js.Array[GoogleFirestoreAdminV1Field]] = js.native
  
  /** A page token that may be used to request another page of results. If blank, this is the last page. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ListFieldsResponse {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListFieldsResponse]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ListFieldsResponseOps[Self <: GoogleFirestoreAdminV1ListFieldsResponse] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: GoogleFirestoreAdminV1Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[GoogleFirestoreAdminV1Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
