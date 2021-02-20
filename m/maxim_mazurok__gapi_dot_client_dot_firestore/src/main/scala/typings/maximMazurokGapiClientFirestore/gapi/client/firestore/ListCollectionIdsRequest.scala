package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionIdsRequest extends StObject {
  
  /** The maximum number of results to return. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** A page token. Must be a value from ListCollectionIdsResponse. */
  var pageToken: js.UndefOr[String] = js.native
}
object ListCollectionIdsRequest {
  
  @scala.inline
  def apply(): ListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsRequest]
  }
  
  @scala.inline
  implicit class ListCollectionIdsRequestMutableBuilder[Self <: ListCollectionIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
