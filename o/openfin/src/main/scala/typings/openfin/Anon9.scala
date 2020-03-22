package typings.openfin

import typings.openfin.windowOptionMod.Accelerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  var newVal: js.UndefOr[Accelerator] = js.undefined
  var oldVal: js.UndefOr[Accelerator] = js.undefined
}

object Anon9 {
  @scala.inline
  def apply(newVal: Accelerator = null, oldVal: Accelerator = null): Anon9 = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon9]
  }
}

