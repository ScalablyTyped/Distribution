package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Ids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMeta extends js.Object {
  /** Attachments where index is attachmentId */
  var _attachments: js.UndefOr[Attachments] = js.undefined
  /**
    * Conflicting leaf revisions.
    *
    * Only present if `GetOptions.conflicts` is `true`
    */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.undefined
  var _rev: RevisionId
  /** Only present if `GetOptions.revs_info` is `true` */
  var _revisions: js.UndefOr[Ids] = js.undefined
  /** Only present if `GetOptions.revs` is `true` */
  var _revs_info: js.UndefOr[js.Array[RevisionInfo]] = js.undefined
}

object GetMeta {
  @scala.inline
  def apply(
    _rev: RevisionId,
    _attachments: Attachments = null,
    _conflicts: js.Array[RevisionId] = null,
    _revisions: Ids = null,
    _revs_info: js.Array[RevisionInfo] = null
  ): GetMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_conflicts != null) __obj.updateDynamic("_conflicts")(_conflicts.asInstanceOf[js.Any])
    if (_revisions != null) __obj.updateDynamic("_revisions")(_revisions.asInstanceOf[js.Any])
    if (_revs_info != null) __obj.updateDynamic("_revs_info")(_revs_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeta]
  }
}

