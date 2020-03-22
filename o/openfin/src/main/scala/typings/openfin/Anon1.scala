package typings.openfin

import typings.openfin.windowOptionMod.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var newVal: js.UndefOr[Api] = js.undefined
  var oldVal: js.UndefOr[Api] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(newVal: Api = null, oldVal: Api = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

