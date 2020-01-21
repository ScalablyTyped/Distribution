package typings.oracleOraclejet.ojdiagramUtilsMod

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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], rotationPointX = rotationPointX.asInstanceOf[js.Any], rotationPointY = rotationPointY.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelLayout]
  }
}

