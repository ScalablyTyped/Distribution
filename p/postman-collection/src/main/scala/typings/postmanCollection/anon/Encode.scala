package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encode extends js.Object {
  var encode: js.UndefOr[Boolean] = js.native
  var ignoreDisabled: js.UndefOr[Boolean] = js.native
}

object Encode {
  @scala.inline
  def apply(): Encode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode]
  }
  @scala.inline
  implicit class EncodeOps[Self <: Encode] (val x: Self) extends AnyVal {
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
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setIgnoreDisabled(value: Boolean): Self = this.set("ignoreDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDisabled: Self = this.set("ignoreDisabled", js.undefined)
  }
  
}

