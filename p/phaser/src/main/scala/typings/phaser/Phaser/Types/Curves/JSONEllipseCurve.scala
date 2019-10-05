package typings.phaser.Phaser.Types.Curves

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEllipseCurve extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: Boolean
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: integer
  /**
    * The rotation of ellipse, in degrees.
    */
  var rotation: integer
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: integer
  /**
    * The of the curve.
    */
  var `type`: String
  /**
    * The x coordinate of the ellipse.
    */
  var x: Double
  /**
    * The horizontal radius of ellipse.
    */
  var xRadius: Double
  /**
    * The y coordinate of the ellipse.
    */
  var y: Double
  /**
    * The vertical radius of ellipse.
    */
  var yRadius: Double
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
    val __obj = js.Dynamic.literal(clockwise = clockwise, endAngle = endAngle, rotation = rotation, startAngle = startAngle, x = x, xRadius = xRadius, y = y, yRadius = yRadius)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONEllipseCurve]
  }
}

