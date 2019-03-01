package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLabelLayout extends js.Object {
  var id: js.Any
  var labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
  var x: scala.Double
  var y: scala.Double
}

object Anon_IdLabelLayout {
  @scala.inline
  def apply(
    id: js.Any,
    labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout,
    x: scala.Double,
    y: scala.Double
  ): Anon_IdLabelLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labelLayout")(labelLayout)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_IdLabelLayout]
  }
}

