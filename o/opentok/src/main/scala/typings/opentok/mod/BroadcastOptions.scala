package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastOptions extends js.Object {
  var layout: BroadcastLayoutOptions
  var maxDuration: js.UndefOr[Double] = js.undefined
  var outputs: BroadcastOutputOptions
  var resolution: js.UndefOr[String] = js.undefined
}

object BroadcastOptions {
  @scala.inline
  def apply(
    layout: BroadcastLayoutOptions,
    outputs: BroadcastOutputOptions,
    maxDuration: js.UndefOr[Double] = js.undefined,
    resolution: String = null
  ): BroadcastOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOptions]
  }
}

