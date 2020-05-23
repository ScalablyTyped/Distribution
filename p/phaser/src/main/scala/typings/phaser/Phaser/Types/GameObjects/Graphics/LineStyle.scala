package typings.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics line style (or stroke style) settings.
  */
trait LineStyle extends js.Object {
  /**
    * The stroke alpha.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The stroke color.
    */
  var color: js.UndefOr[Double] = js.undefined
  /**
    * The stroke width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

