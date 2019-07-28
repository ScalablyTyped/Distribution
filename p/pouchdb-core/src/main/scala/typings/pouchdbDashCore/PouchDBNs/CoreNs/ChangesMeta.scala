package typings.pouchdbDashCore.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesMeta extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.undefined
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.undefined
  var _deleted: js.UndefOr[Boolean] = js.undefined
}

object ChangesMeta {
  @scala.inline
  def apply(
    _attachments: Attachments = null,
    _conflicts: js.Array[RevisionId] = null,
    _deleted: js.UndefOr[Boolean] = js.undefined
  ): ChangesMeta = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_conflicts != null) __obj.updateDynamic("_conflicts")(_conflicts)
    if (!js.isUndefined(_deleted)) __obj.updateDynamic("_deleted")(_deleted)
    __obj.asInstanceOf[ChangesMeta]
  }
}

