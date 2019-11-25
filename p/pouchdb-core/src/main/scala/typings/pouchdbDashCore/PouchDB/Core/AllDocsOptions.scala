package typings.pouchdbDashCore.PouchDB.Core

import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsOptions extends Options {
  /**
    * Include attachment data for each document.
    *
    * Requires `include_docs` to be `true`.
    *
    * By default, attachments are Base64-encoded.
    * @see binary
    */
  var attachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Return attachments as Buffers.
    *
    * Requires `include_docs` to be `true`.
    * Requires `attachments` to be `true`.
    */
  var binary: js.UndefOr[Boolean] = js.undefined
  /**
    * Include conflict information for each document.
    *
    * Requires `include_docs` to be `true`.
    */
  var conflicts: js.UndefOr[Boolean] = js.undefined
  /** Reverse ordering of results. */
  var descending: js.UndefOr[Boolean] = js.undefined
  /** Include contents for each document. */
  var include_docs: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Number of documents to skip before returning.
    *
    * Causes poor performance on IndexedDB and LevelDB.
    */
  var skip: js.UndefOr[Double] = js.undefined
  /**
    * Include an update_seq value indicating which sequence id
    * of the underlying database the view reflects.
    */
  var update_seq: js.UndefOr[Boolean] = js.undefined
}

object AllDocsOptions {
  @scala.inline
  def apply(
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    skip: Int | Double = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): AllDocsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsOptions]
  }
}

