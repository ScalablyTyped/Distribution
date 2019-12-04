package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  /**
    * The x coordinate of the Graphics.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the Graphics.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_XY {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): Anon_XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XY]
  }
}

