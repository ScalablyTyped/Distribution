package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendPhotoOptions extends SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
}
object SendPhotoOptions {
  
  @scala.inline
  def apply(): SendPhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPhotoOptions]
  }
  
  @scala.inline
  implicit class SendPhotoOptionsOps[Self <: SendPhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = this.set("parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse_mode: Self = this.set("parse_mode", js.undefined)
  }
}
