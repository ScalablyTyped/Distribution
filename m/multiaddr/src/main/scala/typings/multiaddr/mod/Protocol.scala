package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protocol extends js.Object {
  var code: Code = js.native
  var name: String = js.native
  var path: Boolean = js.native
  var resolvable: Boolean = js.native
  var size: Size = js.native
}

object Protocol {
  @scala.inline
  def apply(code: Code, name: String, path: Boolean, resolvable: Boolean, size: Size): Protocol = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resolvable = resolvable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
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
    def setCode(value: Code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Boolean): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvable(value: Boolean): Self = this.set("resolvable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

