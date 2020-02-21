package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var ind: js.UndefOr[Double] = js.undefined
  var preloading: js.UndefOr[Boolean] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    ind: Int | Double = null,
    preloading: js.UndefOr[Boolean] = js.undefined
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ind != null) __obj.updateDynamic("ind")(ind.asInstanceOf[js.Any])
    if (!js.isUndefined(preloading)) __obj.updateDynamic("preloading")(preloading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

