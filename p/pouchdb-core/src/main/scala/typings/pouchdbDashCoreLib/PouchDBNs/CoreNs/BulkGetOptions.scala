package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var docs: js.Array[pouchdbDashCoreLib.Anon_IdRev]
  var revs: js.UndefOr[scala.Boolean] = js.undefined
}

object BulkGetOptions {
  @scala.inline
  def apply(
    docs: js.Array[pouchdbDashCoreLib.Anon_IdRev],
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    fetch: pouchdbDashCoreLib.Fetch = null,
    revs: js.UndefOr[scala.Boolean] = js.undefined
  ): BulkGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("docs")(docs)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs)
    __obj.asInstanceOf[BulkGetOptions]
  }
}

