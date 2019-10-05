package typings.pouchdbDashCore.PouchDB.Core

import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends Options {
  var force: js.UndefOr[Boolean] = js.undefined
}

object PutOptions {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    force: js.UndefOr[Boolean] = js.undefined
  ): PutOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[PutOptions]
  }
}

