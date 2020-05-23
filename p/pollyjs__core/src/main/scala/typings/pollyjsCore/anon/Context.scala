package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
}

object Context {
  @scala.inline
  def apply(context: js.Any = null): Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

