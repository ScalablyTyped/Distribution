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
    cellHeight: Int | Double = null,
    cellWidth: Int | Double = null,
    height: Int | Double = null,
    position: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): GridAlignConfig = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAlignConfig]
  }
}

