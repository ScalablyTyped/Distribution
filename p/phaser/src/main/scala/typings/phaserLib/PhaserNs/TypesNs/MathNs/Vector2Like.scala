package typings
package phaserLib.PhaserNs.TypesNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2Like extends js.Object {
  /**
    * The x component.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y component.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Vector2Like {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): Vector2Like = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2Like]
  }
}

