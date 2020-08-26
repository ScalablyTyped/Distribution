package typings.mz.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
}

object Encoding {
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

