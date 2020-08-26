package typings.nivoLine.mod

import typings.nivoLine.anon.XFormatted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var borderColor: String = js.native
  var color: String = js.native
  var data: XFormatted = js.native
  var id: String = js.native
  var index: Double = js.native
  var serieColor: String = js.native
  var serieId: String | Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Point {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    data: XFormatted,
    id: String,
    index: Double,
    serieColor: String,
    serieId: String | Double,
    x: Double,
    y: Double
  ): Point = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieColor = serieColor.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: XFormatted): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerieColor(value: String): Self = this.set("serieColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerieId(value: String | Double): Self = this.set("serieId", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

