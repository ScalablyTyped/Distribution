package typings.nivoLine.anon

import typings.nivoLine.mod.DatumValue
import typings.nivoLine.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var height: Double = js.native
  var id: DatumValue = js.native
  var points: js.Array[Point] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var x0: Double = js.native
  var y: Double = js.native
  var y0: Double = js.native
}

object Height {
  @scala.inline
  def apply(
    height: Double,
    id: DatumValue,
    points: js.Array[Point],
    width: Double,
    x: Double,
    x0: Double,
    y: Double,
    y0: Double
  ): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: DatumValue): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
  }
  
}

