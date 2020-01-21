package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitializer extends js.Object {
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
}

object AnonInitializer {
  @scala.inline
  def apply(initializer: () => _ = null): AnonInitializer = {
    val __obj = js.Dynamic.literal()
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction0(initializer))
    __obj.asInstanceOf[AnonInitializer]
  }
}

