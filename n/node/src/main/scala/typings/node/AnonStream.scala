package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStream extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}

object AnonStream {
  @scala.inline
  def apply(stream: js.UndefOr[Boolean] = js.undefined): AnonStream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStream]
  }
}

