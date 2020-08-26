package typings.phaser.Phaser.Types.Curves

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEllipseCurve extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: Boolean = js.native
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: integer = js.native
  /**
    * The rotation of ellipse, in degrees.
    */
  var rotation: integer = js.native
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: integer = js.native
  /**
    * The of the curve.
    */
  var `type`: String = js.native
  /**
    * The x coordinate of the ellipse.
    */
  var x: Double = js.native
  /**
    * The horizontal radius of ellipse.
    */
  var xRadius: Double = js.native
  /**
    * The y coordinate of the ellipse.
    */
  var y: Double = js.native
  /**
    * The vertical radius of ellipse.
    */
  var yRadius: Double = js.native
}

object JSONEllipseCurve {
  @scala.inline
  def apply(
    clockwise: Boolean,
    endAngle: integer,
    rotation: integer,
    startAngle: integer,
    `type`: String,
    x: Double,
    xRadius: Double,
    y: Double,
    yRadius: Double
  ): JSONEllipseCurve = {
    val __obj = js.Dynamic.literal(clockwise = clockwise.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xRadius = xRadius.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yRadius = yRadius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEllipseCurve]
  }
  @scala.inline
  implicit class JSONEllipseCurveOps[Self <: JSONEllipseCurve] (val x: Self) extends AnyVal {
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
    def setEndAngle(value: integer): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: integer): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: integer): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXRadius(value: Double): Self = this.set("xRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYRadius(value: Double): Self = this.set("yRadius", value.asInstanceOf[js.Any])
  }
  
}

