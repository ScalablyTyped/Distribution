package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenResponse extends StObject {
  
  /** A Document has changed. */
  var documentChange: js.UndefOr[DocumentChange] = js.native
  
  /** A Document has been deleted. */
  var documentDelete: js.UndefOr[DocumentDelete] = js.native
  
  /** A Document has been removed from a target (because it is no longer relevant to that target). */
  var documentRemove: js.UndefOr[DocumentRemove] = js.native
  
  /**
    * A filter to apply to the set of documents previously returned for the given target. Returned when documents may have been removed from the given target, but the exact documents are
    * unknown.
    */
  var filter: js.UndefOr[ExistenceFilter] = js.native
  
  /** Targets have changed. */
  var targetChange: js.UndefOr[TargetChange] = js.native
}
object ListenResponse {
  
  @scala.inline
  def apply(): ListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenResponse]
  }
  
  @scala.inline
  implicit class ListenResponseMutableBuilder[Self <: ListenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentChange(value: DocumentChange): Self = StObject.set(x, "documentChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentChangeUndefined: Self = StObject.set(x, "documentChange", js.undefined)
    
    @scala.inline
    def setDocumentDelete(value: DocumentDelete): Self = StObject.set(x, "documentDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDeleteUndefined: Self = StObject.set(x, "documentDelete", js.undefined)
    
    @scala.inline
    def setDocumentRemove(value: DocumentRemove): Self = StObject.set(x, "documentRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRemoveUndefined: Self = StObject.set(x, "documentRemove", js.undefined)
    
    @scala.inline
    def setFilter(value: ExistenceFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setTargetChange(value: TargetChange): Self = StObject.set(x, "targetChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetChangeUndefined: Self = StObject.set(x, "targetChange", js.undefined)
  }
}
