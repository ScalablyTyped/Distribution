package typings.phaser.Phaser.Types.Display

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
  def apply(
    a: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined,
    g: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined
  ): InputColorObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(g)) __obj.updateDynamic("g")(g.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputColorObject]
  }
}

