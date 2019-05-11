package typings
package phaserLib.PhaserNs.TypesNs.ActionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAlignConfig extends js.Object {
  /**
    * The height of the cell, in pixels, in which the item is positioned.
    */
  var cellHeight: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The width of the cell, in pixels, in which the item is positioned.
    */
  var cellWidth: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The height of the grid in items (not pixels). -1 means lay all items out vertically, regardless of quantity.
    *                                   If both this value and `width` are set to -1 then `width` overrides it and this value is ignored.
    */
  var height: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The alignment position. One of the Phaser.Display.Align consts such as `TOP_LEFT` or `RIGHT_CENTER`.
    */
  var position: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The width of the grid in items (not pixels). -1 means lay all items out horizontally, regardless of quantity.
    *                                  If both this value and height are set to -1 then this value overrides it and the `height` value is ignored.
    */
  var width: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object GridAlignConfig {
  @scala.inline
  def apply(
    cellHeight: js.UndefOr[phaserLib.integer] = js.undefined,
    cellWidth: js.UndefOr[phaserLib.integer] = js.undefined,
    height: js.UndefOr[phaserLib.integer] = js.undefined,
    position: js.UndefOr[phaserLib.integer] = js.undefined,
    width: js.UndefOr[phaserLib.integer] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): GridAlignConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellHeight)) __obj.updateDynamic("cellHeight")(cellHeight)
    if (!js.isUndefined(cellWidth)) __obj.updateDynamic("cellWidth")(cellWidth)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAlignConfig]
  }
}

