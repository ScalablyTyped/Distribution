package typings.oauthDashShim

import typings.oauthDashShim.oauthDashShimNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  @JSName("get")
  def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit
}

object Anon_Cb {
  @scala.inline
  def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Anon_Cb = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Anon_Cb]
  }
}

