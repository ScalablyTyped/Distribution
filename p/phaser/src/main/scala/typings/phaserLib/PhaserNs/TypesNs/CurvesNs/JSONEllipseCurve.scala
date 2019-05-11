package typings
package phaserLib.PhaserNs.TypesNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEllipseCurve extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: scala.Boolean
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: phaserLib.integer
  /**
    * The rotation of ellipse, in degrees.
    */
  var rotation: phaserLib.integer
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: phaserLib.integer
  /**
    * The of the curve.
    */
  var `type`: java.lang.String
  /**
    * The x coordinate of the ellipse.
    */
  var x: scala.Double
  /**
    * The horizontal radius of ellipse.
    */
  var xRadius: scala.Double
  /**
    * The y coordinate of the ellipse.
    */
  var y: scala.Double
  /**
    * The vertical radius of ellipse.
    */
  var yRadius: scala.Double
}

object JSONEllipseCurve {
  @scala.inline
  def apply(
    clockwise: scala.Boolean,
    endAngle: phaserLib.integer,
    rotation: phaserLib.integer,
    startAngle: phaserLib.integer,
    `type`: java.lang.String,
    x: scala.Double,
    xRadius: scala.Double,
    y: scala.Double,
    yRadius: scala.Double
  ): JSONEllipseCurve = {
    val __obj = js.Dynamic.literal(clockwise = clockwise, endAngle = endAngle, rotation = rotation, startAngle = startAngle, x = x, xRadius = xRadius, y = y, yRadius = yRadius)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONEllipseCurve]
  }
}

