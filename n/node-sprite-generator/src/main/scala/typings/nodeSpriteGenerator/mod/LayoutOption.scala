package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOption extends js.Object {
  var padding: js.UndefOr[Double] = js.undefined
  var scaling: js.UndefOr[Double] = js.undefined
}

object LayoutOption {
  @scala.inline
  def apply(padding: js.UndefOr[Double] = js.undefined, scaling: js.UndefOr[Double] = js.undefined): LayoutOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaling)) __obj.updateDynamic("scaling")(scaling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOption]
  }
}

