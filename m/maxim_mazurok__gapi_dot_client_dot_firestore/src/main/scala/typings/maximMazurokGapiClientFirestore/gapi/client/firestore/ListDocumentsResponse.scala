package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentsResponse extends StObject {
  
  /** The Documents found. */
  var documents: js.UndefOr[js.Array[Document]] = js.native
  
  /** The next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListDocumentsResponse {
  
  @scala.inline
  def apply(): ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResponse]
  }
  
  @scala.inline
  implicit class ListDocumentsResponseMutableBuilder[Self <: ListDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
