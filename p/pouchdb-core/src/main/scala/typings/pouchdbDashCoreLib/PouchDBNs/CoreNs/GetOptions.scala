package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetOptions extends Options {
  /** Include attachment data. */
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** Include list of conflicting leaf revisions. */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Forces retrieving latest “leaf” revision, no matter what rev was requested. */
  var latest: js.UndefOr[scala.Boolean] = js.undefined
  /** Specific revision to fetch */
  var rev: js.UndefOr[RevisionId] = js.undefined
  /** Include revision history of the document. */
  var revs: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Include a list of revisions of the document, and their
               * availability.
               */
  var revs_info: js.UndefOr[scala.Boolean] = js.undefined
}

