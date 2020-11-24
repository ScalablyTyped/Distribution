package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sticker extends js.Object {
  
  var emoji: js.UndefOr[String] = js.native
  
  var file_id: String = js.native
  
  var file_size: js.UndefOr[Double] = js.native
  
  var file_unique_id: String = js.native
  
  var height: Double = js.native
  
  var is_animated: Boolean = js.native
  
  var mask_position: js.UndefOr[MaskPosition] = js.native
  
  var set_name: js.UndefOr[String] = js.native
  
  var thumb: js.UndefOr[PhotoSize] = js.native
  
  var width: Double = js.native
}
object Sticker {
  
  @scala.inline
  def apply(file_id: String, file_unique_id: String, height: Double, is_animated: Boolean, width: Double): Sticker = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_animated = is_animated.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sticker]
  }
  
  @scala.inline
  implicit class StickerOps[Self <: Sticker] (val x: Self) extends AnyVal {
    
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
    def setFile_id(value: String): Self = this.set("file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_unique_id(value: String): Self = this.set("file_unique_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_animated(value: Boolean): Self = this.set("is_animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    
    @scala.inline
    def setFile_size(value: Double): Self = this.set("file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_size: Self = this.set("file_size", js.undefined)
    
    @scala.inline
    def setMask_position(value: MaskPosition): Self = this.set("mask_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask_position: Self = this.set("mask_position", js.undefined)
    
    @scala.inline
    def setSet_name(value: String): Self = this.set("set_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet_name: Self = this.set("set_name", js.undefined)
    
    @scala.inline
    def setThumb(value: PhotoSize): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
  }
}
