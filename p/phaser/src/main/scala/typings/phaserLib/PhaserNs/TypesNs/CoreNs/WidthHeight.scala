package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidthHeight extends js.Object {
  /**
    * The height.
    */
  var height: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The width.
    */
  var width: js.UndefOr[phaserLib.integer] = js.undefined
}

object WidthHeight {
  @scala.inline
  def apply(
    height: js.UndefOr[phaserLib.integer] = js.undefined,
    width: js.UndefOr[phaserLib.integer] = js.undefined
  ): WidthHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[WidthHeight]
  }
}

