package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Anon_IdRev
import typings.pouchdbDashCore.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var docs: js.Array[Anon_IdRev]
  var revs: js.UndefOr[Boolean] = js.undefined
}

object BulkGetOptions {
  @scala.inline
  def apply(
    docs: js.Array[Anon_IdRev],
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    fetch: Fetch = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs)
    __obj.asInstanceOf[BulkGetOptions]
  }
}

