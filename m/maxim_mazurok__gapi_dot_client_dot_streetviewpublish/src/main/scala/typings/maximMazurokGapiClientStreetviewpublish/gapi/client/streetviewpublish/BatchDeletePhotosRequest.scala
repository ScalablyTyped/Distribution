package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeletePhotosRequest extends StObject {
  
  /** Required. IDs of the Photos. HTTP GET requests require the following syntax for the URL query parameter: `photoIds=&photoIds=&...`. */
  var photoIds: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchDeletePhotosRequest {
  
  inline def apply(): BatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhotosRequest]
  }
  
  extension [Self <: BatchDeletePhotosRequest](x: Self) {
    
    inline def setPhotoIds(value: js.Array[String]): Self = StObject.set(x, "photoIds", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdsUndefined: Self = StObject.set(x, "photoIds", js.undefined)
    
    inline def setPhotoIdsVarargs(value: String*): Self = StObject.set(x, "photoIds", js.Array(value :_*))
  }
}
