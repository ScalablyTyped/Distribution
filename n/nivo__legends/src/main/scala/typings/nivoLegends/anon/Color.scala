package typings.nivoLegends.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var id: String | Double
  var value: Double
}

object Color {
  @scala.inline
  def apply(id: String | Double, value: Double, color: String = null, fill: String = null): Color = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

