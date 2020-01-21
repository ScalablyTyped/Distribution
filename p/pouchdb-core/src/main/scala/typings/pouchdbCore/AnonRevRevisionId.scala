package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRevRevisionId extends js.Object {
  var rev: js.UndefOr[RevisionId] = js.undefined
}

object AnonRevRevisionId {
  @scala.inline
  def apply(rev: RevisionId = null): AnonRevRevisionId = {
    val __obj = js.Dynamic.literal()
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRevRevisionId]
  }
}

