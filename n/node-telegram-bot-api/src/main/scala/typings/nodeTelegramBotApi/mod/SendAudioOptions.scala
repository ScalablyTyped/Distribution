package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAudioOptions extends SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
  
  var performer: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SendAudioOptions {
  
  @scala.inline
  def apply(): SendAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAudioOptions]
  }
  
  @scala.inline
  implicit class SendAudioOptionsOps[Self <: SendAudioOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = this.set("parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse_mode: Self = this.set("parse_mode", js.undefined)
    
    @scala.inline
    def setPerformer(value: String): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
