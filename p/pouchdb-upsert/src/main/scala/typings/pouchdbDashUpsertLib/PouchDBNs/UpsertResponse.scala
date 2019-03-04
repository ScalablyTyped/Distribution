package typings
package pouchdbDashUpsertLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertResponse extends js.Object {
  var id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId
  var rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId
  var updated: scala.Boolean
}

object UpsertResponse {
  @scala.inline
  def apply(
    id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    updated: scala.Boolean
  ): UpsertResponse = {
    val __obj = js.Dynamic.literal(id = id, rev = rev, updated = updated)
  
    __obj.asInstanceOf[UpsertResponse]
  }
}

