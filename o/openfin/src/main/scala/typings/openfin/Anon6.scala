package typings.openfin

import typings.openfin.shapesMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  var newVal: js.UndefOr[RGB] = js.undefined
  var oldVal: js.UndefOr[RGB] = js.undefined
}

object Anon6 {
  @scala.inline
  def apply(newVal: RGB = null, oldVal: RGB = null): Anon6 = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon6]
  }
}

