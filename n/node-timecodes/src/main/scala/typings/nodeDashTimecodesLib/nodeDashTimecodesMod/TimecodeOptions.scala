package typings
package nodeDashTimecodesLib.nodeDashTimecodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimecodeOptions extends js.Object {
  var frameRate: js.UndefOr[scala.Double] = js.undefined
  var ms: js.UndefOr[scala.Boolean] = js.undefined
}

object TimecodeOptions {
  @scala.inline
  def apply(frameRate: scala.Int | scala.Double = null, ms: js.UndefOr[scala.Boolean] = js.undefined): TimecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms)
    __obj.asInstanceOf[TimecodeOptions]
  }
}

