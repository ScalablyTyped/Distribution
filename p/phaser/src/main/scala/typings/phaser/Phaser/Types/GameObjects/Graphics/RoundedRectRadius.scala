package typings.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundedRectRadius extends js.Object {
  /**
    * Bottom left
    */
  var bl: js.UndefOr[Double] = js.undefined
  /**
    * Bottom right
    */
  var br: js.UndefOr[Double] = js.undefined
  /**
    * Top left
    */
  var tl: js.UndefOr[Double] = js.undefined
  /**
    * Top right
    */
  var tr: js.UndefOr[Double] = js.undefined
}

object RoundedRectRadius {
  @scala.inline
  def apply(bl: Int | Double = null, br: Int | Double = null, tl: Int | Double = null, tr: Int | Double = null): RoundedRectRadius = {
    val __obj = js.Dynamic.literal()
    if (bl != null) __obj.updateDynamic("bl")(bl.asInstanceOf[js.Any])
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (tl != null) __obj.updateDynamic("tl")(tl.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectRadius]
  }
}

