package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(context: js.Any = null, key: String = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

