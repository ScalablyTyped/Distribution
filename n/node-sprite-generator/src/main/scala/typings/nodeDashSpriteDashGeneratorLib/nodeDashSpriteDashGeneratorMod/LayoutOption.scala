package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOption extends js.Object {
  var padding: js.UndefOr[scala.Double] = js.undefined
  var scaling: js.UndefOr[scala.Double] = js.undefined
}

object LayoutOption {
  @scala.inline
  def apply(padding: scala.Int | scala.Double = null, scaling: scala.Int | scala.Double = null): LayoutOption = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOption]
  }
}

