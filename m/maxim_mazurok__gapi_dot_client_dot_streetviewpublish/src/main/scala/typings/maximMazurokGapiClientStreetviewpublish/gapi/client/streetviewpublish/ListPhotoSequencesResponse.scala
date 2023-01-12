package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhotoSequencesResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of photo sequences via Operation interface. The maximum number of items returned is based on the pageSize field in the request. Each item in the list can have three possible
    * states, * `Operation.done` = false, if the processing of PhotoSequence is not finished yet. * `Operation.done` = true and `Operation.error` is populated, if there was an error in
    * processing. * `Operation.done` = true and `Operation.response` contains a PhotoSequence message, In each sequence, only Id is populated.
    */
  var photoSequences: js.UndefOr[js.Array[Operation]] = js.undefined
}
object ListPhotoSequencesResponse {
  
  inline def apply(): ListPhotoSequencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhotoSequencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhotoSequencesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhotoSequences(value: js.Array[Operation]): Self = StObject.set(x, "photoSequences", value.asInstanceOf[js.Any])
    
    inline def setPhotoSequencesUndefined: Self = StObject.set(x, "photoSequences", js.undefined)
    
    inline def setPhotoSequencesVarargs(value: Operation*): Self = StObject.set(x, "photoSequences", js.Array(value*))
  }
}
