package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsWithinRangeOptions extends AllDocsOptions {
  /** High end of range, or low end if `descending` is `true`. */
  var endkey: DocumentKey
  /**
    * Include any documents identified by `endkey`.
    *
    * Defaults to `true`.
    */
  var inclusive_end: js.UndefOr[Boolean] = js.undefined
  /** Low end of range, or high end if `descending` is `true`. */
  var startkey: DocumentKey
}

object AllDocsWithinRangeOptions {
  @scala.inline
  def apply(
    endkey: DocumentKey,
    startkey: DocumentKey,
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    fetch: Fetch = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    inclusive_end: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    skip: Int | Double = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): AllDocsWithinRangeOptions = {
    val __obj = js.Dynamic.literal(endkey = endkey, startkey = startkey)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq)
    __obj.asInstanceOf[AllDocsWithinRangeOptions]
  }
}

