package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRemove extends StObject {
  
  /** The resource name of the Document that has gone out of view. */
  var document: js.UndefOr[String] = js.native
  
  /** The read timestamp at which the remove was observed. Greater or equal to the `commit_time` of the change/delete/remove. */
  var readTime: js.UndefOr[String] = js.native
  
  /** A set of target IDs for targets that previously matched this document. */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}
object DocumentRemove {
  
  @scala.inline
  def apply(): DocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentRemove]
  }
  
  @scala.inline
  implicit class DocumentRemoveMutableBuilder[Self <: DocumentRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
  }
}
