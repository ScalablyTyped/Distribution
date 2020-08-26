package typings.megajs.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkOptions extends js.Object {
  var key: js.UndefOr[String | Buffer] = js.native
  var noKey: js.UndefOr[Boolean] = js.native
}

object LinkOptions {
  @scala.inline
  def apply(): LinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOptions]
  }
  @scala.inline
  implicit class LinkOptionsOps[Self <: LinkOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNoKey(value: Boolean): Self = this.set("noKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoKey: Self = this.set("noKey", js.undefined)
  }
  
}

