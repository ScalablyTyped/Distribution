package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetch: js.UndefOr[pouchdbDashCoreLib.Fetch] = js.undefined
}

object Options {
  @scala.inline
  def apply(fetch: pouchdbDashCoreLib.Fetch = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    __obj.asInstanceOf[Options]
  }
}

