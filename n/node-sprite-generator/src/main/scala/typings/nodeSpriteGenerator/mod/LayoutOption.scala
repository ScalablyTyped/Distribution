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
  def apply(padding: Int | Double = null, scaling: Int | Double = null): LayoutOption = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOption]
  }
}

