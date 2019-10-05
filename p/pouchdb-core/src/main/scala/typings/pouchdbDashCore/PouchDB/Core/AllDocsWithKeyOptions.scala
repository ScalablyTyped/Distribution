package typings.pouchdbDashCore.PouchDB.Core

import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsWithKeyOptions extends AllDocsOptions {
  /** Constrain results to documents matching this key. */
  var key: DocumentKey
}

object AllDocsWithKeyOptions {
  @scala.inline
  def apply(
    key: DocumentKey,
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    skip: Int | Double = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): AllDocsWithKeyOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq)
    __obj.asInstanceOf[AllDocsWithKeyOptions]
  }
}

