package typings.nivoTooltip.mod

import typings.nivoTooltip.PartialCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps extends js.Object {
  var color: String
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[PartialCSSProperties] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(color: String, size: Int | Double = null, style: PartialCSSProperties = null): ChipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipProps]
  }
}

