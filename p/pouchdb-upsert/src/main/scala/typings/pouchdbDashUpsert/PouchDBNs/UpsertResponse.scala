package typings.pouchdbDashUpsert.PouchDBNs

import typings.pouchdbDashCore.PouchDBNs.CoreNs.DocumentId
import typings.pouchdbDashCore.PouchDBNs.CoreNs.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertResponse extends js.Object {
  var id: DocumentId
  var rev: RevisionId
  var updated: Boolean
}

object UpsertResponse {
  @scala.inline
  def apply(id: DocumentId, rev: RevisionId, updated: Boolean): UpsertResponse = {
    val __obj = js.Dynamic.literal(id = id, rev = rev, updated = updated)
  
    __obj.asInstanceOf[UpsertResponse]
  }
}

