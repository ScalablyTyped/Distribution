package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform[T] extends js.Object {
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.undefined
}

object AnonTransform {
  @scala.inline
  def apply[T](transform: /* document */ T => _ = null): AnonTransform[T] = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[AnonTransform[T]]
  }
}

