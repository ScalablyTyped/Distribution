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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("rev")(rev)
    __obj.asInstanceOf[RemoveAttachmentResponse]
  }
}

