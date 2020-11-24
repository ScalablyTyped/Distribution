package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultLocationBase extends InlineQueryResultBase {
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var thumb_height: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var thumb_width: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object InlineQueryResultLocationBase {
  
  @scala.inline
  def apply(id: String, latitude: Double, longitude: Double, title: String): InlineQueryResultLocationBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocationBase]
  }
  
  @scala.inline
  implicit class InlineQueryResultLocationBaseOps[Self <: InlineQueryResultLocationBase] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    
    @scala.inline
    def setThumb_height(value: Double): Self = this.set("thumb_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb_height: Self = this.set("thumb_height", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = this.set("thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb_url: Self = this.set("thumb_url", js.undefined)
    
    @scala.inline
    def setThumb_width(value: Double): Self = this.set("thumb_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb_width: Self = this.set("thumb_width", js.undefined)
  }
}
