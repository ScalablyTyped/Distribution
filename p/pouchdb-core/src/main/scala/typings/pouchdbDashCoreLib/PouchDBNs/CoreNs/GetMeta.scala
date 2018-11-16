package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

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
  var _revisions: js.UndefOr[pouchdbDashCoreLib.Anon_Ids] = js.undefined
  /** Only present if `GetOptions.revs` is `true` */
  var _revs_info: js.UndefOr[js.Array[RevisionInfo]] = js.undefined
}

