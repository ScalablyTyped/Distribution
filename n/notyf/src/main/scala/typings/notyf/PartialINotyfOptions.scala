package typings.notyf

import typings.notyf.notyfOptionsMod.INotyfPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfOptions> */
trait PartialINotyfOptions extends js.Object {
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[INotyfPosition] = js.undefined
  var ripple: js.UndefOr[Boolean] = js.undefined
  var types: js.UndefOr[js.Array[DeepPartialINotyfNotifica]] = js.undefined
}

object PartialINotyfOptions {
  @scala.inline
  def apply(
    dismissible: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    position: INotyfPosition = null,
    ripple: js.UndefOr[Boolean] = js.undefined,
    types: js.Array[DeepPartialINotyfNotifica] = null
  ): PartialINotyfOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialINotyfOptions]
  }
}

