package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamResponseOptions extends js.Object {
  var endStream: js.UndefOr[scala.Boolean] = js.undefined
  var waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerStreamResponseOptions {
  @scala.inline
  def apply(
    endStream: js.UndefOr[scala.Boolean] = js.undefined,
    waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerStreamResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream)
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers)
    __obj.asInstanceOf[ServerStreamResponseOptions]
  }
}

