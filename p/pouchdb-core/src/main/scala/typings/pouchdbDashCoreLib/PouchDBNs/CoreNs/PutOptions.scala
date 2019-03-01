package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends Options {
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object PutOptions {
  @scala.inline
  def apply(fetch: pouchdbDashCoreLib.Fetch = null, force: js.UndefOr[scala.Boolean] = js.undefined): PutOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[PutOptions]
  }
}

