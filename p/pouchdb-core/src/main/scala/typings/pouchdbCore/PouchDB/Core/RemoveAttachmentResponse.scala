package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttachmentResponse extends BasicResponse {
  var id: DocumentId
  var rev: RevisionId
}

object RemoveAttachmentResponse {
  @scala.inline
  def apply(id: DocumentId, ok: Boolean, rev: RevisionId): RemoveAttachmentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAttachmentResponse]
  }
}

