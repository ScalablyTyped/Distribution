package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Fetch
import typings.pouchdbDashCore.pouchdbDashCoreStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenRevisions extends Options {
  /**
    * Fetch all leaf revisions if open_revs="all" or fetch all leaf
    * revisions specified in open_revs array. Leaves will be returned
    * in the same order as specified in input array.
    */
  var open_revs: all | js.Array[RevisionId]
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.undefined
}

object GetOpenRevisions {
  @scala.inline
  def apply(
    open_revs: all | js.Array[RevisionId],
    fetch: Fetch = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): GetOpenRevisions = {
    val __obj = js.Dynamic.literal(open_revs = open_revs.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs)
    __obj.asInstanceOf[GetOpenRevisions]
  }
}

