package typings.phaser.Phaser.Types.GameObjects.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Padding configuration object as used by the Text Style.
  */
trait TextPadding extends js.Object {
  /**
    * The amount of padding added to the bottom of the Text object.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding added to the left of the Text object.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding added to the right of the Text object.
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding added to the top of the Text object.
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * If set this value is used for both the left and right padding.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * If set this value is used for both the top and bottom padding.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object TextPadding {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TextPadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPadding]
  }
}

