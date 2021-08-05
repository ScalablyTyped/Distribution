package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhotosResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of photos. The pageSize field in the request determines the number of items returned. */
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
}
object ListPhotosResponse {
  
  inline def apply(): ListPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhotosResponse]
  }
  
  extension [Self <: ListPhotosResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value :_*))
  }
}
