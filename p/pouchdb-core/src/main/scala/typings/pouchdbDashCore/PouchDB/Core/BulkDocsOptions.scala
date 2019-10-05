package typings.pouchdbDashCore.PouchDB.Core

import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkDocsOptions extends Options {
  var new_edits: js.UndefOr[Boolean] = js.undefined
}

object BulkDocsOptions {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    new_edits: js.UndefOr[Boolean] = js.undefined
  ): BulkDocsOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(new_edits)) __obj.updateDynamic("new_edits")(new_edits)
    __obj.asInstanceOf[BulkDocsOptions]
  }
}

