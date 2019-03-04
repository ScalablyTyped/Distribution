package typings
package atOracleOraclejetLib.ojdiagramDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelLayout extends js.Object {
  var angle: scala.Double
  var halign: java.lang.String
  var rotationPointX: scala.Double
  var rotationPointY: scala.Double
  var valign: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object LabelLayout {
  @scala.inline
  def apply(
    angle: scala.Double,
    halign: java.lang.String,
    rotationPointX: scala.Double,
    rotationPointY: scala.Double,
    valign: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(angle = angle, halign = halign, rotationPointX = rotationPointX, rotationPointY = rotationPointY, valign = valign, x = x, y = y)
  
    __obj.asInstanceOf[LabelLayout]
  }
}

