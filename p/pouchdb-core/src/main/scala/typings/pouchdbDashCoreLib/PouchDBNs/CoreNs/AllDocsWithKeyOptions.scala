package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

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
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    fetch: pouchdbDashCoreLib.Fetch = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null
  ): AllDocsWithKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithKeyOptions]
  }
}

