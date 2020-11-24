package typings.nodemailer.sendmailTransportMod

import typings.nodemailer.mod.Transport
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendmailTransport extends Transport {
  
  var args: js.Array[String] | `false` = js.native
  
  var logger: Logger = js.native
  
  @JSName("mailer")
  var mailer_SendmailTransport: typings.nodemailer.mailerMod.^ = js.native
  
  var options: Options = js.native
  
  var path: String = js.native
  
  var winbreak: Boolean = js.native
}
object SendmailTransport {
  
  @scala.inline
  def apply(
    args: js.Array[String] | `false`,
    logger: Logger,
    mailer: typings.nodemailer.mailerMod.^,
    name: String,
    options: Options,
    path: String,
    send: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]) => Unit,
    verify: (js.UndefOr[
      js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
    ]) with js.UndefOr[js.Function0[js.Promise[`true`]]],
    version: String,
    winbreak: Boolean
  ): SendmailTransport = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendmailTransport]
  }
  
  @scala.inline
  implicit class SendmailTransportOps[Self <: SendmailTransport] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String] | `false`): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailer(value: typings.nodemailer.mailerMod.^): Self = this.set("mailer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinbreak(value: Boolean): Self = this.set("winbreak", value.asInstanceOf[js.Any])
  }
}
