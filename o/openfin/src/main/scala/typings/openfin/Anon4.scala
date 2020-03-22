package typings.openfin

import typings.openfin.windowOptionMod.CornerRounding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  var newVal: js.UndefOr[CornerRounding] = js.undefined
  var oldVal: js.UndefOr[CornerRounding] = js.undefined
}

object Anon4 {
  @scala.inline
  def apply(newVal: CornerRounding = null, oldVal: CornerRounding = null): Anon4 = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4]
  }
}

