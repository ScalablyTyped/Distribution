package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deleted extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var rev: RevisionId
}

object Deleted {
  @scala.inline
  def apply(rev: RevisionId, deleted: js.UndefOr[Boolean] = js.undefined): Deleted = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
}

