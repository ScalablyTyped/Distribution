package typings.nodeTimecodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimecodeOptions extends js.Object {
  var frameRate: js.UndefOr[Double] = js.undefined
  var ms: js.UndefOr[Boolean] = js.undefined
}

object TimecodeOptions {
  @scala.inline
  def apply(frameRate: Int | Double = null, ms: js.UndefOr[Boolean] = js.undefined): TimecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeOptions]
  }
}

