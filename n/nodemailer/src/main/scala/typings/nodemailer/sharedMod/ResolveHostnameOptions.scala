package typings.nodemailer.sharedMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveHostnameOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var servername: js.UndefOr[String | `false`] = js.native
}

object ResolveHostnameOptions {
  @scala.inline
  def apply(): ResolveHostnameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveHostnameOptions]
  }
  @scala.inline
  implicit class ResolveHostnameOptionsOps[Self <: ResolveHostnameOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setServername(value: String | `false`): Self = this.set("servername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
  }
  
}

