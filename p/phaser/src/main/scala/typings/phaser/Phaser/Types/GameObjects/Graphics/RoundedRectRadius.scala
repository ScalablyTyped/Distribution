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
  def apply(
    bl: js.UndefOr[Double] = js.undefined,
    br: js.UndefOr[Double] = js.undefined,
    tl: js.UndefOr[Double] = js.undefined,
    tr: js.UndefOr[Double] = js.undefined
  ): RoundedRectRadius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bl)) __obj.updateDynamic("bl")(bl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(br)) __obj.updateDynamic("br")(br.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tl)) __obj.updateDynamic("tl")(tl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tr)) __obj.updateDynamic("tr")(tr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectRadius]
  }
}

