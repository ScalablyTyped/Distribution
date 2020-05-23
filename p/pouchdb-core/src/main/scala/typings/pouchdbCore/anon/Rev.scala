package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rev extends js.Object {
  var id: String
  var rev: js.UndefOr[RevisionId] = js.undefined
}

object Rev {
  @scala.inline
  def apply(id: String, rev: RevisionId = null): Rev = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
}

