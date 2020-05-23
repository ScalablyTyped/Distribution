package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevRevisionId extends js.Object {
  var rev: js.UndefOr[RevisionId] = js.undefined
}

object RevRevisionId {
  @scala.inline
  def apply(rev: RevisionId = null): RevRevisionId = {
    val __obj = js.Dynamic.literal()
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevRevisionId]
  }
}

