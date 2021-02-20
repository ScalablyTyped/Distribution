package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttachmentResponse extends BasicResponse {
  
  var id: DocumentId = js.native
  
  var rev: RevisionId = js.native
}
object RemoveAttachmentResponse {
  
  @scala.inline
  def apply(id: DocumentId, ok: Boolean, rev: RevisionId): RemoveAttachmentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttachmentResponse]
  }
  
  @scala.inline
  implicit class RemoveAttachmentResponseMutableBuilder[Self <: RemoveAttachmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DocumentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
