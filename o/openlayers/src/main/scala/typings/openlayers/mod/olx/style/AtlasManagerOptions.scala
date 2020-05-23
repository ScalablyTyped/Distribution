package typings.openlayers.mod.olx.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasManagerOptions extends js.Object {
  var initialSize: js.UndefOr[Double] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[Double] = js.undefined
}

object AtlasManagerOptions {
  @scala.inline
  def apply(
    initialSize: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    space: js.UndefOr[Double] = js.undefined
  ): AtlasManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialSize)) __obj.updateDynamic("initialSize")(initialSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasManagerOptions]
  }
}

