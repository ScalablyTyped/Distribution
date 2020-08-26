package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEllpiticalArcOptions extends IRadiusOptions {
  var clockwise: js.UndefOr[Boolean] = js.native
  var large: js.UndefOr[Boolean] = js.native
  var xaxisrotation: js.UndefOr[Double] = js.native
  var xradius: js.UndefOr[Double] = js.native
  var yradius: js.UndefOr[Double] = js.native
}

object IEllpiticalArcOptions {
  @scala.inline
  def apply(): IEllpiticalArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllpiticalArcOptions]
  }
  @scala.inline
  implicit class IEllpiticalArcOptionsOps[Self <: IEllpiticalArcOptions] (val x: Self) extends AnyVal {
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
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setXaxisrotation(value: Double): Self = this.set("xaxisrotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXaxisrotation: Self = this.set("xaxisrotation", js.undefined)
    @scala.inline
    def setXradius(value: Double): Self = this.set("xradius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXradius: Self = this.set("xradius", js.undefined)
    @scala.inline
    def setYradius(value: Double): Self = this.set("yradius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYradius: Self = this.set("yradius", js.undefined)
  }
  
}

