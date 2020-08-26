package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICircleOptions extends IRadiusOptions {
  var center: js.UndefOr[Vector2D | js.Array[Double]] = js.native
}

object ICircleOptions {
  @scala.inline
  def apply(): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircleOptions]
  }
  @scala.inline
  implicit class ICircleOptionsOps[Self <: ICircleOptions] (val x: Self) extends AnyVal {
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
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: Vector2D | js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
  }
  
}

