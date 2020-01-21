package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLimits extends js.Object {
  var codeRangeSizeMb: js.UndefOr[Double] = js.undefined
  var maxOldGenerationSizeMb: js.UndefOr[Double] = js.undefined
  var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.undefined
}

object ResourceLimits {
  @scala.inline
  def apply(
    codeRangeSizeMb: Int | Double = null,
    maxOldGenerationSizeMb: Int | Double = null,
    maxYoungGenerationSizeMb: Int | Double = null
  ): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    if (codeRangeSizeMb != null) __obj.updateDynamic("codeRangeSizeMb")(codeRangeSizeMb.asInstanceOf[js.Any])
    if (maxOldGenerationSizeMb != null) __obj.updateDynamic("maxOldGenerationSizeMb")(maxOldGenerationSizeMb.asInstanceOf[js.Any])
    if (maxYoungGenerationSizeMb != null) __obj.updateDynamic("maxYoungGenerationSizeMb")(maxYoungGenerationSizeMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
}

