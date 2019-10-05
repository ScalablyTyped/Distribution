package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdRev extends js.Object {
  var id: String
  var rev: RevisionId
}

object Anon_IdRev {
  @scala.inline
  def apply(id: String, rev: RevisionId): Anon_IdRev = {
    val __obj = js.Dynamic.literal(id = id, rev = rev)
  
    __obj.asInstanceOf[Anon_IdRev]
  }
}

