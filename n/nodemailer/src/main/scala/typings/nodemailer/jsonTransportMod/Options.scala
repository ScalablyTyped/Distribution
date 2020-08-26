package typings.nodemailer.jsonTransportMod

import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.nodemailer.mailerMod.Options
     with TransportOptions {
  var jsonTransport: `true` = js.native
  var skipEncoding: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(jsonTransport: `true`): Options = {
    val __obj = js.Dynamic.literal(jsonTransport = jsonTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setJsonTransport(value: `true`): Self = this.set("jsonTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipEncoding(value: Boolean): Self = this.set("skipEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipEncoding: Self = this.set("skipEncoding", js.undefined)
  }
  
}

