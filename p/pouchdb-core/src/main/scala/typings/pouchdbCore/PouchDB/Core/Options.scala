package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.Fetch
import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetch: js.UndefOr[Fetch] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    __obj.asInstanceOf[Options]
  }
}

