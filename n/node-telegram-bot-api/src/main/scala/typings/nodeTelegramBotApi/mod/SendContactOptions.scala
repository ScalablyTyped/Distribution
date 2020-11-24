package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendContactOptions extends SendBasicOptions {
  
  var last_name: js.UndefOr[String] = js.native
  
  var vcard: js.UndefOr[String] = js.native
}
object SendContactOptions {
  
  @scala.inline
  def apply(): SendContactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendContactOptions]
  }
  
  @scala.inline
  implicit class SendContactOptionsOps[Self <: SendContactOptions] (val x: Self) extends AnyVal {
    
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
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    
    @scala.inline
    def setVcard(value: String): Self = this.set("vcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVcard: Self = this.set("vcard", js.undefined)
  }
}
