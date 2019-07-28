package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkDocsOptions extends Options {
  var new_edits: js.UndefOr[Boolean] = js.undefined
}

object BulkDocsOptions {
  @scala.inline
  def apply(fetch: Fetch = null, new_edits: js.UndefOr[Boolean] = js.undefined): BulkDocsOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(new_edits)) __obj.updateDynamic("new_edits")(new_edits)
    __obj.asInstanceOf[BulkDocsOptions]
  }
}

