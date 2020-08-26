package typings.ngxInfiniteScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHeightKey extends js.Object {
  var clientHeightKey: js.Any = js.native
  var offsetHeightKey: js.Any = js.native
}

object ClientHeightKey {
  @scala.inline
  def apply(clientHeightKey: js.Any, offsetHeightKey: js.Any): ClientHeightKey = {
    val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHeightKey]
  }
  @scala.inline
  implicit class ClientHeightKeyOps[Self <: ClientHeightKey] (val x: Self) extends AnyVal {
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
    def setClientHeightKey(value: js.Any): Self = this.set("clientHeightKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetHeightKey(value: js.Any): Self = this.set("offsetHeightKey", value.asInstanceOf[js.Any])
  }
  
}

