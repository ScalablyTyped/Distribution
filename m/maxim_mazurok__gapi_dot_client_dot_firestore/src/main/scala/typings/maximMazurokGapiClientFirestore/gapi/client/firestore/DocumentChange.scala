package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentChange extends StObject {
  
  /** The new state of the Document. If `mask` is set, contains only fields that were updated or added. */
  var document: js.UndefOr[Document] = js.native
  
  /** A set of target IDs for targets that no longer match this document. */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
  
  /** A set of target IDs of targets that match this document. */
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}
object DocumentChange {
  
  @scala.inline
  def apply(): DocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChange]
  }
  
  @scala.inline
  implicit class DocumentChangeMutableBuilder[Self <: DocumentChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}
