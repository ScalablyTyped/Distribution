package typings.nodeValidator.ValidatorOptions

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsStringOptions extends Options {
  var message: js.UndefOr[String] = js.native
  var regex: js.UndefOr[RegExp] = js.native
}

object IsStringOptions {
  @scala.inline
  def apply(): IsStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsStringOptions]
  }
  @scala.inline
  implicit class IsStringOptionsOps[Self <: IsStringOptions] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
  
}

