package typings.nodeForge.mod.cipher

import typings.nodeForge.mod.Byte
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOptions extends js.Object {
  var additionalData: js.UndefOr[String] = js.native
  var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.native
  var tag: js.UndefOr[ByteStringBuffer] = js.native
  var tagLength: js.UndefOr[Double] = js.native
}

object StartOptions {
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalData(value: String): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    @scala.inline
    def setIvVarargs(value: Byte*): Self = this.set("iv", js.Array(value :_*))
    @scala.inline
    def setIv(value: ByteBuffer | js.Array[Byte] | Bytes): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    @scala.inline
    def setTag(value: ByteStringBuffer): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTagLength(value: Double): Self = this.set("tagLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagLength: Self = this.set("tagLength", js.undefined)
  }
  
}

