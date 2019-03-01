package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactOptions extends Options {
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object CompactOptions {
  @scala.inline
  def apply(fetch: pouchdbDashCoreLib.Fetch = null, interval: scala.Int | scala.Double = null): CompactOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactOptions]
  }
}

