package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradientColor extends js.Object {
  /**
    * the destination point of the gradient stops: Array of GradientStop - the gradient stops describing the gradient, as an alternative to providing a gradient object
    */
  var destination: js.UndefOr[Point] = js.undefined
  /**
    * the gradient object that describes the color stops and type of gradient to be used.
    */
  var gradient: js.UndefOr[Gradient] = js.undefined
  /**
    * the origin point of the gradient
    */
  var origin: js.UndefOr[Point] = js.undefined
  /**
    * controls whether the gradient is radial, as an alternative to providing a gradient object
    */
  var radial: js.UndefOr[Boolean] = js.undefined
}

object IGradientColor {
  @scala.inline
  def apply(
    destination: Point = null,
    gradient: Gradient = null,
    origin: Point = null,
    radial: js.UndefOr[Boolean] = js.undefined
  ): IGradientColor = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(radial)) __obj.updateDynamic("radial")(radial)
    __obj.asInstanceOf[IGradientColor]
  }
}

