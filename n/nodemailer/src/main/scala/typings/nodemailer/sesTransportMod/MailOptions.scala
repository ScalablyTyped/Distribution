package typings.nodemailer.sesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailOptions
  extends typings.nodemailer.mailerMod.Options {
  
  /** list of keys that SendRawEmail method can take */
  var ses: js.UndefOr[MailSesOptions] = js.native
}
object MailOptions {
  
  @scala.inline
  def apply(): MailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailOptions]
  }
  
  @scala.inline
  implicit class MailOptionsOps[Self <: MailOptions] (val x: Self) extends AnyVal {
    
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
    def setSes(value: MailSesOptions): Self = this.set("ses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSes: Self = this.set("ses", js.undefined)
  }
}
