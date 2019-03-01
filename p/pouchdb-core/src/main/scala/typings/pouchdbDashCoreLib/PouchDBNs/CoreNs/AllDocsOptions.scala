package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

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
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return attachments as Buffers.
    *
    * Requires `include_docs` to be `true`.
    * Requires `attachments` to be `true`.
    */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include conflict information for each document.
    *
    * Requires `include_docs` to be `true`.
    */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Reverse ordering of results. */
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  /** Include contents for each document. */
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of documents to skip before returning.
    *
    * Causes poor performance on IndexedDB and LevelDB.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object AllDocsOptions {
  @scala.inline
  def apply(
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    fetch: pouchdbDashCoreLib.Fetch = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null
  ): AllDocsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsOptions]
  }
}

