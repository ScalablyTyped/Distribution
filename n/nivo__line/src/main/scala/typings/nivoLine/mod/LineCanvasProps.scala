package typings.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineCanvasProps extends LineProps {
  var pixelRatio: js.UndefOr[Double] = js.native
}

object LineCanvasProps {
  @scala.inline
  def apply(data: js.Array[Serie]): LineCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCanvasProps]
  }
  @scala.inline
  implicit class LineCanvasPropsOps[Self <: LineCanvasProps] (val x: Self) extends AnyVal {
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
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
  }
  
}

