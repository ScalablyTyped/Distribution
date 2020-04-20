package typings.pouchdbUpsert.PouchDB

import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.RevisionId
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertResponse]
  }
}

