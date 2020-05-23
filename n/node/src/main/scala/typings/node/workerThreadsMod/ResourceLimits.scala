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
    codeRangeSizeMb: js.UndefOr[Double] = js.undefined,
    maxOldGenerationSizeMb: js.UndefOr[Double] = js.undefined,
    maxYoungGenerationSizeMb: js.UndefOr[Double] = js.undefined
  ): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(codeRangeSizeMb)) __obj.updateDynamic("codeRangeSizeMb")(codeRangeSizeMb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOldGenerationSizeMb)) __obj.updateDynamic("maxOldGenerationSizeMb")(maxOldGenerationSizeMb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxYoungGenerationSizeMb)) __obj.updateDynamic("maxYoungGenerationSizeMb")(maxYoungGenerationSizeMb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
}

