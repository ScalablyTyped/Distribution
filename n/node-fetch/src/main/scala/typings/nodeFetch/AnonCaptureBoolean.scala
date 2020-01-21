package typings.nodeFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaptureBoolean extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
}

object AnonCaptureBoolean {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): AnonCaptureBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaptureBoolean]
  }
}

