package typings.phaser.Phaser.Types.Actions

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAlignConfig extends js.Object {
  /**
    * The height of the cell, in pixels, in which the item is positioned.
    */
  var cellHeight: js.UndefOr[integer] = js.undefined
  /**
    * The width of the cell, in pixels, in which the item is positioned.
    */
  var cellWidth: js.UndefOr[integer] = js.undefined
  /**
    * The height of the grid in items (not pixels). -1 means lay all items out vertically, regardless of quantity.
    *                                   If both this value and `width` are set to -1 then `width` overrides it and this value is ignored.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The alignment position. One of the Phaser.Display.Align consts such as `TOP_LEFT` or `RIGHT_CENTER`.
    */
  var position: js.UndefOr[integer] = js.undefined
  /**
    * The width of the grid in items (not pixels). -1 means lay all items out horizontally, regardless of quantity.
    *                                  If both this value and height are set to -1 then this value overrides it and the `height` value is ignored.
    */
  var width: js.UndefOr[integer] = js.undefined
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Optionally place the top-left of the final grid at this coordinate.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object GridAlignConfig {
  @scala.inline
  def apply(
    cellHeight: js.UndefOr[integer] = js.undefined,
    cellWidth: js.UndefOr[integer] = js.undefined,
    height: js.UndefOr[integer] = js.undefined,
    position: js.UndefOr[integer] = js.undefined,
    width: js.UndefOr[integer] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): GridAlignConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellHeight)) __obj.updateDynamic("cellHeight")(cellHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellWidth)) __obj.updateDynamic("cellWidth")(cellWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAlignConfig]
  }
}

