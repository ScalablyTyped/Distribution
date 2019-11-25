package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamResponseOptions extends js.Object {
  var endStream: js.UndefOr[Boolean] = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}

object ServerStreamResponseOptions {
  @scala.inline
  def apply(endStream: js.UndefOr[Boolean] = js.undefined, waitForTrailers: js.UndefOr[Boolean] = js.undefined): ServerStreamResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStreamResponseOptions]
  }
}

