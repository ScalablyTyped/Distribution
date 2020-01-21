package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument[T] extends js.Object {
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.undefined
}

object AnonDocument {
  @scala.inline
  def apply[T](transform: /* document */ T => _ = null): AnonDocument[T] = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[AnonDocument[T]]
  }
}

