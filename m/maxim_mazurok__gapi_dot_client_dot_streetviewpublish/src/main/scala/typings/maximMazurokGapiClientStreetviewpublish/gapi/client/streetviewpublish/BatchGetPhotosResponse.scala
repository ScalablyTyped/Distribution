package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetPhotosResponse extends StObject {
  
  /** List of results for each individual Photo requested, in the same order as the requests in BatchGetPhotos. */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.native
}
object BatchGetPhotosResponse {
  
  @scala.inline
  def apply(): BatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPhotosResponse]
  }
  
  @scala.inline
  implicit class BatchGetPhotosResponseMutableBuilder[Self <: BatchGetPhotosResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[PhotoResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: PhotoResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
