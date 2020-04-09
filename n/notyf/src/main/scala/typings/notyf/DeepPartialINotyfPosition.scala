package typings.notyf

import typings.notyf.notyfOptionsMod.DeepPartial
import typings.notyf.notyfOptionsMod.NotyfHorizontalPosition
import typings.notyf.notyfOptionsMod.NotyfVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined notyf.notyf/notyf.options.DeepPartial<notyf.notyf/notyf.options.INotyfPosition> */
trait DeepPartialINotyfPosition extends js.Object {
  var x: js.UndefOr[DeepPartial[NotyfHorizontalPosition]] = js.undefined
  var y: js.UndefOr[DeepPartial[NotyfVerticalPosition]] = js.undefined
}

object DeepPartialINotyfPosition {
  @scala.inline
  def apply(x: DeepPartial[NotyfHorizontalPosition] = null, y: DeepPartial[NotyfVerticalPosition] = null): DeepPartialINotyfPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPartialINotyfPosition]
  }
}

