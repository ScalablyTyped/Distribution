package typings.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics fill style settings.
  */
trait FillStyle extends js.Object {
  /**
    * The fill alpha.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The fill color.
    */
  var color: js.UndefOr[Double] = js.undefined
}

object FillStyle {
  @scala.inline
  def apply(alpha: js.UndefOr[Double] = js.undefined, color: js.UndefOr[Double] = js.undefined): FillStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
}

