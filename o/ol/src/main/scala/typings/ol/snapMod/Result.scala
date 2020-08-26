package typings.ol.snapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var snapped: Boolean = js.native
  var vertex: Coordinate = js.native
  var vertexPixel: Pixel = js.native
}

object Result {
  @scala.inline
  def apply(snapped: Boolean, vertex: Coordinate, vertexPixel: Pixel): Result = {
    val __obj = js.Dynamic.literal(snapped = snapped.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any], vertexPixel = vertexPixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setSnapped(value: Boolean): Self = this.set("snapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexVarargs(value: Double*): Self = this.set("vertex", js.Array(value :_*))
    @scala.inline
    def setVertex(value: Coordinate): Self = this.set("vertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexPixelVarargs(value: Double*): Self = this.set("vertexPixel", js.Array(value :_*))
    @scala.inline
    def setVertexPixel(value: Pixel): Self = this.set("vertexPixel", value.asInstanceOf[js.Any])
  }
  
}

