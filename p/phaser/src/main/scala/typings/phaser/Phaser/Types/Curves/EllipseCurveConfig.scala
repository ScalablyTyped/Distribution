package typings.phaser.Phaser.Types.Curves

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseCurveConfig extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: js.UndefOr[integer] = js.native
  /**
    * The rotation of the ellipse, in degrees.
    */
  var rotation: js.UndefOr[integer] = js.native
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: js.UndefOr[integer] = js.native
  /**
    * The x coordinate of the ellipse.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The horizontal radius of the ellipse.
    */
  var xRadius: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the ellipse.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The vertical radius of the ellipse.
    */
  var yRadius: js.UndefOr[Double] = js.native
}

object EllipseCurveConfig {
  @scala.inline
  def apply(): EllipseCurveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseCurveConfig]
  }
  @scala.inline
  implicit class EllipseCurveConfigOps[Self <: EllipseCurveConfig] (val x: Self) extends AnyVal {
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
    def setEndAngle(value: integer): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setRotation(value: integer): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setStartAngle(value: integer): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXRadius(value: Double): Self = this.set("xRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXRadius: Self = this.set("xRadius", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYRadius(value: Double): Self = this.set("yRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYRadius: Self = this.set("yRadius", js.undefined)
  }
  
}

