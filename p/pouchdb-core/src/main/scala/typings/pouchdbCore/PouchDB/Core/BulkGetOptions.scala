package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Rev
import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var docs: js.Array[Rev]
  var revs: js.UndefOr[Boolean] = js.undefined
}

object BulkGetOptions {
  @scala.inline
  def apply(
    docs: js.Array[Rev],
    attachments: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetOptions]
  }
}

