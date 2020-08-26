package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOptions extends js.Object {
  var color: Color = js.native
  var opacity: Double = js.native
  var symmetric: Boolean = js.native
  var thickness: Double = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
}

object ErrorOptions {
  @scala.inline
  def apply(
    color: Color,
    opacity: Double,
    symmetric: Boolean,
    thickness: Double,
    visible: Boolean,
    width: Double
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], symmetric = symmetric.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOptions]
  }
  @scala.inline
  implicit class ErrorOptionsOps[Self <: ErrorOptions] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymmetric(value: Boolean): Self = this.set("symmetric", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

