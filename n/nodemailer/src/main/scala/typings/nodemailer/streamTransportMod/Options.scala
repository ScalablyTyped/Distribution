package typings.nodemailer.streamTransportMod

import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.nodemailer.mailerMod.Options
     with TransportOptions {
  /** if true, then returns the message as a Buffer object instead of a stream */
  var buffer: js.UndefOr[Boolean] = js.native
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[String] = js.native
  var streamTransport: `true` = js.native
}

object Options {
  @scala.inline
  def apply(streamTransport: `true`): Options = {
    val __obj = js.Dynamic.literal(streamTransport = streamTransport.asInstanceOf[js.Any])
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
    def setStreamTransport(value: `true`): Self = this.set("streamTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
  }
  
}

