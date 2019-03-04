package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttachmentResponse extends BasicResponse {
  var id: DocumentId
  var rev: RevisionId
}

object RemoveAttachmentResponse {
  @scala.inline
  def apply(id: DocumentId, ok: scala.Boolean, rev: RevisionId): RemoveAttachmentResponse = {
    val __obj = js.Dynamic.literal(id = id, ok = ok, rev = rev)
  
    __obj.asInstanceOf[RemoveAttachmentResponse]
  }
}

