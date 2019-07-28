package typings.phaser.PhaserNs.TypesNs.CurvesNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipseCurveConfig extends js.Object {
  /**
    * Sets if the the ellipse rotation is clockwise (true) or anti-clockwise (false)
    */
  var clockwise: js.UndefOr[Boolean] = js.undefined
  /**
    * The end angle of the ellipse, in degrees.
    */
  var endAngle: js.UndefOr[integer] = js.undefined
  /**
    * The rotation of the ellipse, in degrees.
    */
  var rotation: js.UndefOr[integer] = js.undefined
  /**
    * The start angle of the ellipse, in degrees.
    */
  var startAngle: js.UndefOr[integer] = js.undefined
  /**
    * The x coordinate of the ellipse.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal radius of the ellipse.
    */
  var xRadius: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the ellipse.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * The vertical radius of the ellipse.
    */
  var yRadius: js.UndefOr[Double] = js.undefined
}

object EllipseCurveConfig {
  @scala.inline
  def apply(
    clockwise: js.UndefOr[Boolean] = js.undefined,
    endAngle: js.UndefOr[integer] = js.undefined,
    rotation: js.UndefOr[integer] = js.undefined,
    startAngle: js.UndefOr[integer] = js.undefined,
    x: Int | Double = null,
    xRadius: Int | Double = null,
    y: Int | Double = null,
    yRadius: Int | Double = null
  ): EllipseCurveConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle)
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xRadius != null) __obj.updateDynamic("xRadius")(xRadius.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yRadius != null) __obj.updateDynamic("yRadius")(yRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseCurveConfig]
  }
}

