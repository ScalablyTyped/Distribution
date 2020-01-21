package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeleted extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var rev: RevisionId
}

object AnonDeleted {
  @scala.inline
  def apply(rev: RevisionId, deleted: js.UndefOr[Boolean] = js.undefined): AnonDeleted = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeleted]
  }
}

