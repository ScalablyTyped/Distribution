package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActPromiseResult[T] extends js.Object {
  var context: Hemera[ClientRequest, ClientResponse] = js.native
  var data: T = js.native
}

object ActPromiseResult {
  @scala.inline
  def apply[T](context: Hemera[ClientRequest, ClientResponse], data: T): ActPromiseResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActPromiseResult[T]]
  }
  @scala.inline
  implicit class ActPromiseResultOps[Self <: ActPromiseResult[_], T] (val x: Self with ActPromiseResult[T]) extends AnyVal {
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
    def setContext(value: Hemera[ClientRequest, ClientResponse]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

