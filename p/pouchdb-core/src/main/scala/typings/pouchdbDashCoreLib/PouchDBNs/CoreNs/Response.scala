package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

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
  def apply(id: DocumentId, ok: scala.Boolean, rev: RevisionId): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("rev")(rev)
    __obj.asInstanceOf[Response]
  }
}

