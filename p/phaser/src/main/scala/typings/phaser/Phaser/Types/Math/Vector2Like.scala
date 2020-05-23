package typings.phaser.Phaser.Types.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2Like extends js.Object {
  /**
    * The x component.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y component.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Vector2Like {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Vector2Like = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2Like]
  }
}

