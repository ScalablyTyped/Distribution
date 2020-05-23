package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldVal extends js.Object {
  var newVal: js.UndefOr[Config] = js.undefined
  var oldVal: js.UndefOr[Config] = js.undefined
}

object OldVal {
  @scala.inline
  def apply(newVal: Config = null, oldVal: Config = null): OldVal = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldVal]
  }
}

