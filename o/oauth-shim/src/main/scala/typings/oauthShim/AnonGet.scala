package typings.oauthShim

import typings.oauthShim.oauthShimBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  @JSName("get")
  def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit
}

object AnonGet {
  @scala.inline
  def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[AnonGet]
  }
}

