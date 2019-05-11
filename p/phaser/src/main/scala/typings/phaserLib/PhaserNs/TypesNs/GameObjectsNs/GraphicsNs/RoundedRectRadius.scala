package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundedRectRadius extends js.Object {
  /**
    * Bottom left
    */
  var bl: js.UndefOr[scala.Double] = js.undefined
  /**
    * Bottom right
    */
  var br: js.UndefOr[scala.Double] = js.undefined
  /**
    * Top left
    */
  var tl: js.UndefOr[scala.Double] = js.undefined
  /**
    * Top right
    */
  var tr: js.UndefOr[scala.Double] = js.undefined
}

object RoundedRectRadius {
  @scala.inline
  def apply(
    bl: scala.Int | scala.Double = null,
    br: scala.Int | scala.Double = null,
    tl: scala.Int | scala.Double = null,
    tr: scala.Int | scala.Double = null
  ): RoundedRectRadius = {
    val __obj = js.Dynamic.literal()
    if (bl != null) __obj.updateDynamic("bl")(bl.asInstanceOf[js.Any])
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (tl != null) __obj.updateDynamic("tl")(tl.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectRadius]
  }
}

