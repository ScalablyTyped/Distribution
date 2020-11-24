package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDicomStoresResponse extends js.Object {
  
  /** The returned DICOM stores. Won't be more DICOM stores than the value of page_size in the request. */
  var dicomStores: js.UndefOr[js.Array[DicomStore]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListDicomStoresResponse {
  
  @scala.inline
  def apply(): ListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDicomStoresResponse]
  }
  
  @scala.inline
  implicit class ListDicomStoresResponseOps[Self <: ListDicomStoresResponse] (val x: Self) extends AnyVal {
    
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
    def setDicomStoresVarargs(value: DicomStore*): Self = this.set("dicomStores", js.Array(value :_*))
    
    @scala.inline
    def setDicomStores(value: js.Array[DicomStore]): Self = this.set("dicomStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDicomStores: Self = this.set("dicomStores", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
