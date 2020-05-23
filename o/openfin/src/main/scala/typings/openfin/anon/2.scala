package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var newVal: js.UndefOr[String] = js.undefined
  var oldVal: js.UndefOr[String] = js.undefined
}

object `2` {
  @scala.inline
  def apply(newVal: String = null, oldVal: String = null): `2` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

