package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var newVal: js.UndefOr[js.Any] = js.undefined
  var oldVal: js.UndefOr[js.Any] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(newVal: js.Any = null, oldVal: js.Any = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

