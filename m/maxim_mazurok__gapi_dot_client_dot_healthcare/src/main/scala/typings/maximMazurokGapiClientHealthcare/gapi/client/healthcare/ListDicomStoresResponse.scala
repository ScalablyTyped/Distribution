package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDicomStoresResponse extends StObject {
  
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
  implicit class ListDicomStoresResponseMutableBuilder[Self <: ListDicomStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDicomStores(value: js.Array[DicomStore]): Self = StObject.set(x, "dicomStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicomStoresUndefined: Self = StObject.set(x, "dicomStores", js.undefined)
    
    @scala.inline
    def setDicomStoresVarargs(value: DicomStore*): Self = StObject.set(x, "dicomStores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
