package typings.oauthShim.anon

import typings.oauthShim.oauthShimBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  @JSName("get")
  def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit = js.native
}

object Get {
  @scala.inline
  def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Self = this.set("get", js.Any.fromFunction2(value))
  }
  
}

