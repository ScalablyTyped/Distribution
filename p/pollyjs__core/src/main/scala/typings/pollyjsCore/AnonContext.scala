package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(context: js.Any = null): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

