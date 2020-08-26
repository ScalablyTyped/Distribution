package typings.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewerOptions extends js.Object {
  var bgColor: js.UndefOr[Double] = js.native
  var color: js.UndefOr[js.Array[Double]] = js.native
  var drawFaces: js.UndefOr[Boolean] = js.native
  var drawLines: js.UndefOr[Boolean] = js.native
  var noWebGL: js.UndefOr[Boolean] = js.native
}

object IViewerOptions {
  @scala.inline
  def apply(): IViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewerOptions]
  }
  @scala.inline
  implicit class IViewerOptionsOps[Self <: IViewerOptions] (val x: Self) extends AnyVal {
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
    def setBgColor(value: Double): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDrawFaces(value: Boolean): Self = this.set("drawFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawFaces: Self = this.set("drawFaces", js.undefined)
    @scala.inline
    def setDrawLines(value: Boolean): Self = this.set("drawLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawLines: Self = this.set("drawLines", js.undefined)
    @scala.inline
    def setNoWebGL(value: Boolean): Self = this.set("noWebGL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWebGL: Self = this.set("noWebGL", js.undefined)
  }
  
}

