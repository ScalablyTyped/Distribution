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
  def apply(height: Int | Double = null, width: Int | Double = null): WidthHeight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthHeight]
  }
}

