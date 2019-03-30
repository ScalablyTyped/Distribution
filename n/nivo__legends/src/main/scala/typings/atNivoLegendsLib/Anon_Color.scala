package typings
package atNivoLegendsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String | scala.Double
  var value: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    value: scala.Double,
    color: java.lang.String = null,
    fill: java.lang.String = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[Anon_Color]
  }
}

