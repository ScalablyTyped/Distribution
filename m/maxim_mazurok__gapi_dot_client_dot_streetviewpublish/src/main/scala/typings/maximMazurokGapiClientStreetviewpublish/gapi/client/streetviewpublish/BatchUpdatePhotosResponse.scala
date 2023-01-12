package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePhotosResponse extends StObject {
  
  /** List of results for each individual Photo updated, in the same order as the request. */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.undefined
}
object BatchUpdatePhotosResponse {
  
  inline def apply(): BatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePhotosResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdatePhotosResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[PhotoResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: PhotoResponse*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
