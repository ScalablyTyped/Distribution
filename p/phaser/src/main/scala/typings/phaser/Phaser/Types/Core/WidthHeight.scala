package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidthHeight extends js.Object {
  /**
    * The height.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The width.
    */
  var width: js.UndefOr[integer] = js.undefined
}

object WidthHeight {
  @scala.inline
  def apply(height: js.UndefOr[integer] = js.undefined, width: js.UndefOr[integer] = js.undefined): WidthHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthHeight]
  }
}

