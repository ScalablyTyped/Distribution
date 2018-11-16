package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetOpenRevisions extends Options {
  /**
               * Fetch all leaf revisions if open_revs="all" or fetch all leaf
               * revisions specified in open_revs array. Leaves will be returned
               * in the same order as specified in input array.
               */
  var open_revs: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.all | js.Array[RevisionId]
  /** Include revision history of the document. */
  var revs: js.UndefOr[scala.Boolean] = js.undefined
}

