package typings.phaser.PhaserNs.TypesNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputColorObject extends js.Object {
  /**
    * The alpha color value in the range 0 to 255.
    */
  var a: js.UndefOr[Double] = js.undefined
  /**
    * The blue color value in the range 0 to 255.
    */
  var b: js.UndefOr[Double] = js.undefined
  /**
    * The green color value in the range 0 to 255.
    */
  var g: js.UndefOr[Double] = js.undefined
  /**
    * The red color value in the range 0 to 255.
    */
  var r: js.UndefOr[Double] = js.undefined
}

object InputColorObject {
  @scala.inline
  def apply(a: Int | Double = null, b: Int | Double = null, g: Int | Double = null, r: Int | Double = null): InputColorObject = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputColorObject]
  }
}

