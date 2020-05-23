package typings.oauthShim.anon

import typings.oauthShim.oauthShimBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  @JSName("get")
  def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit
}

object Get {
  @scala.inline
  def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Get]
  }
}

