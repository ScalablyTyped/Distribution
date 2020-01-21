package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdRev extends js.Object {
  var id: String
  var rev: RevisionId
}

object AnonIdRev {
  @scala.inline
  def apply(id: String, rev: RevisionId): AnonIdRev = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdRev]
  }
}

