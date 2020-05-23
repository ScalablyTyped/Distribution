package typings.pouchdbCore.PouchDB.Core

import typings.std.Request
import typings.std.RequestInit
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
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    inclusive_end: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): AllDocsWithinRangeOptions = {
    val __obj = js.Dynamic.literal(endkey = endkey.asInstanceOf[js.Any], startkey = startkey.asInstanceOf[js.Any])
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.get.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithinRangeOptions]
  }
}

