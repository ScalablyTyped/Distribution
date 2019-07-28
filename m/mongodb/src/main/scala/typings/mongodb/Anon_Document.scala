package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document[T] extends js.Object {
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.undefined
}

object Anon_Document {
  @scala.inline
  def apply[T](transform: /* document */ T => _ = null): Anon_Document[T] = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Anon_Document[T]]
  }
}

