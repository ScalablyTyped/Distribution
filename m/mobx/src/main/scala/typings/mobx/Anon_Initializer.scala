package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initializer extends js.Object {
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
}

object Anon_Initializer {
  @scala.inline
  def apply(initializer: () => _ = null): Anon_Initializer = {
    val __obj = js.Dynamic.literal()
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction0(initializer))
    __obj.asInstanceOf[Anon_Initializer]
  }
}

