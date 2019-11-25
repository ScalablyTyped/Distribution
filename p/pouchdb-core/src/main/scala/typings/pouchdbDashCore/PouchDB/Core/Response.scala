package typings.pouchdbDashCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends BasicResponse {
  /** id of the targeted document */
  var id: DocumentId
  /** resulting revision of the targeted document */
  var rev: RevisionId
}

object Response {
  @scala.inline
  def apply(id: DocumentId, ok: Boolean, rev: RevisionId): Response = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

