package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetch: js.UndefOr[Fetch] = js.undefined
}

object Options {
  @scala.inline
  def apply(fetch: Fetch = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    __obj.asInstanceOf[Options]
  }
}

