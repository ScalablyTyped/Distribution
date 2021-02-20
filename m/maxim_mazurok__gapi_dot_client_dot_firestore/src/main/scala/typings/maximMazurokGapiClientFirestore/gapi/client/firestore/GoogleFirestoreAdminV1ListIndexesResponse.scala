package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ListIndexesResponse extends StObject {
  
  /** The requested indexes. */
  var indexes: js.UndefOr[js.Array[GoogleFirestoreAdminV1Index]] = js.native
  
  /** A page token that may be used to request another page of results. If blank, this is the last page. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ListIndexesResponse {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListIndexesResponse]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ListIndexesResponseMutableBuilder[Self <: GoogleFirestoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexes(value: js.Array[GoogleFirestoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: GoogleFirestoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
