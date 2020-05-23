package typings.nodeFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureBoolean extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
}

object CaptureBoolean {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): CaptureBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureBoolean]
  }
}

