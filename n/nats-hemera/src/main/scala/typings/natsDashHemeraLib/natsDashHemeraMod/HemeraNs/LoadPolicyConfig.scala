package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPolicyConfig extends js.Object {
  var maxEventLoopDelay: js.UndefOr[scala.Double] = js.undefined
  var maxHeapUsedBytes: js.UndefOr[scala.Double] = js.undefined
  var maxRssBytes: js.UndefOr[scala.Double] = js.undefined
}

object LoadPolicyConfig {
  @scala.inline
  def apply(
    maxEventLoopDelay: scala.Int | scala.Double = null,
    maxHeapUsedBytes: scala.Int | scala.Double = null,
    maxRssBytes: scala.Int | scala.Double = null
  ): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (maxEventLoopDelay != null) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.asInstanceOf[js.Any])
    if (maxHeapUsedBytes != null) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.asInstanceOf[js.Any])
    if (maxRssBytes != null) __obj.updateDynamic("maxRssBytes")(maxRssBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPolicyConfig]
  }
}

