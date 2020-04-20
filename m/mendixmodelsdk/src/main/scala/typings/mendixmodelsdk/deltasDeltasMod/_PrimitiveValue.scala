package typings.mendixmodelsdk.deltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PrimitiveValue extends js.Object

object _PrimitiveValue {
  @scala.inline
  def IPoint(x: Double, y: Double): _PrimitiveValue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PrimitiveValue]
  }
  @scala.inline
  def ISize(height: Double, width: Double): _PrimitiveValue = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PrimitiveValue]
  }
  @scala.inline
  def IColor(blue: Double, green: Double, red: Double): _PrimitiveValue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PrimitiveValue]
  }
}

