package typings.phaser.Phaser.Types.Curves

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
    x: js.UndefOr[Double] = js.undefined,
    xRadius: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    yRadius: js.UndefOr[Double] = js.undefined
  ): EllipseCurveConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xRadius)) __obj.updateDynamic("xRadius")(xRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yRadius)) __obj.updateDynamic("yRadius")(yRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseCurveConfig]
  }
}

