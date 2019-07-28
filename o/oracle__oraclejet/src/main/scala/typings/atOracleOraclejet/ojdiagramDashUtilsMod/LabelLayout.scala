package typings.atOracleOraclejet.ojdiagramDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelLayout extends js.Object {
  var angle: Double
  var halign: String
  var rotationPointX: Double
  var rotationPointY: Double
  var valign: String
  var x: Double
  var y: Double
}

object LabelLayout {
  @scala.inline
  def apply(
    angle: Double,
    halign: String,
    rotationPointX: Double,
    rotationPointY: Double,
    valign: String,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(angle = angle, halign = halign, rotationPointX = rotationPointX, rotationPointY = rotationPointY, valign = valign, x = x, y = y)
  
    __obj.asInstanceOf[LabelLayout]
  }
}

