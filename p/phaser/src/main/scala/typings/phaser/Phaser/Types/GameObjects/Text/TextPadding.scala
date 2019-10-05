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
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): TextPadding = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPadding]
  }
}

