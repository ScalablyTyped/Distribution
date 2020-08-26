package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptReturn extends js.Object {
  var data: Buffer = js.native
   // The cipher text
  var tag: js.UndefOr[Buffer] = js.native
}

object EncryptReturn {
  @scala.inline
  def apply(data: Buffer): EncryptReturn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptReturn]
  }
  @scala.inline
  implicit class EncryptReturnOps[Self <: EncryptReturn] (val x: Self) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Buffer): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

