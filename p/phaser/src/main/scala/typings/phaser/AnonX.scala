package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  /**
    * The x coordinate of the Graphics.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the Graphics.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonX {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): AnonX = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

