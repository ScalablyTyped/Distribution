package typings.naverWhale.whale.webRequest

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHeader extends js.Object {
  var binaryValue: js.UndefOr[ArrayBuffer] = js.native
  var name: String = js.native
  var value: js.UndefOr[String] = js.native
}

object HttpHeader {
  @scala.inline
  def apply(name: String): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeader]
  }
  @scala.inline
  implicit class HttpHeaderOps[Self <: HttpHeader] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryValue(value: ArrayBuffer): Self = this.set("binaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryValue: Self = this.set("binaryValue", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

