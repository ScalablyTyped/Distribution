package typings.phosphorWidgets.scrollbarMod.ScrollBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a scroll bar.
  */
trait IOptions extends js.Object {
  /**
    * The maximum value for the scroll bar.
    *
    * The default is `100`.
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /**
    * The orientation of the scroll bar.
    *
    * The default is `'vertical'`.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * The page size for the scroll bar.
    *
    * The default is `10`.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The value for the scroll bar.
    *
    * The default is `0`.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    maximum: Int | Double = null,
    orientation: Orientation = null,
    page: Int | Double = null,
    value: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

