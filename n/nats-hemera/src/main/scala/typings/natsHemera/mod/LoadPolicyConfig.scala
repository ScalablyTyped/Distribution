package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPolicyConfig extends js.Object {
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  var maxRssBytes: js.UndefOr[Double] = js.undefined
}

object LoadPolicyConfig {
  @scala.inline
  def apply(
    maxEventLoopDelay: Int | Double = null,
    maxHeapUsedBytes: Int | Double = null,
    maxRssBytes: Int | Double = null
  ): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (maxEventLoopDelay != null) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.asInstanceOf[js.Any])
    if (maxHeapUsedBytes != null) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.asInstanceOf[js.Any])
    if (maxRssBytes != null) __obj.updateDynamic("maxRssBytes")(maxRssBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPolicyConfig]
  }
}

