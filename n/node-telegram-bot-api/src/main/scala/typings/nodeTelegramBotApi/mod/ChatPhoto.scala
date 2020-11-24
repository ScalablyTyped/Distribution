package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatPhoto extends js.Object {
  
  var big_file_id: String = js.native
  
  var small_file_id: String = js.native
}
object ChatPhoto {
  
  @scala.inline
  def apply(big_file_id: String, small_file_id: String): ChatPhoto = {
    val __obj = js.Dynamic.literal(big_file_id = big_file_id.asInstanceOf[js.Any], small_file_id = small_file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatPhoto]
  }
  
  @scala.inline
  implicit class ChatPhotoOps[Self <: ChatPhoto] (val x: Self) extends AnyVal {
    
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
    def setBig_file_id(value: String): Self = this.set("big_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall_file_id(value: String): Self = this.set("small_file_id", value.asInstanceOf[js.Any])
  }
}
