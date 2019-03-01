package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initializer extends js.Object {
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
}

object Anon_Initializer {
  @scala.inline
  def apply(initializer: js.Function0[_] = null): Anon_Initializer = {
    val __obj = js.Dynamic.literal()
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    __obj.asInstanceOf[Anon_Initializer]
  }
}

