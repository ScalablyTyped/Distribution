package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDBNs.CoreNs.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deleted extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var rev: RevisionId
}

object Anon_Deleted {
  @scala.inline
  def apply(rev: RevisionId, deleted: js.UndefOr[Boolean] = js.undefined): Anon_Deleted = {
    val __obj = js.Dynamic.literal(rev = rev)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[Anon_Deleted]
  }
}

