package typings.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var id: String | Double
  var value: Double
}

object Anon_Color {
  @scala.inline
  def apply(id: String | Double, value: Double, color: String = null, fill: String = null): Anon_Color = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[Anon_Color]
  }
}

