package typings.pouchdbDashCore.PouchDB.Core

import typings.pouchdbDashCore.Anon_IdRev
import typings.std.Request
import typings.std.RequestInit
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
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs)
    __obj.asInstanceOf[BulkGetOptions]
  }
}

