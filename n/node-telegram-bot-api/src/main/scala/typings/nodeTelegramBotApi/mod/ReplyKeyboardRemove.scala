package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyKeyboardRemove extends js.Object {
  
  var remove_keyboard: Boolean = js.native
  
  var selective: js.UndefOr[Boolean] = js.native
}
object ReplyKeyboardRemove {
  
  @scala.inline
  def apply(remove_keyboard: Boolean): ReplyKeyboardRemove = {
    val __obj = js.Dynamic.literal(remove_keyboard = remove_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
  
  @scala.inline
  implicit class ReplyKeyboardRemoveOps[Self <: ReplyKeyboardRemove] (val x: Self) extends AnyVal {
    
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
    def setRemove_keyboard(value: Boolean): Self = this.set("remove_keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelective(value: Boolean): Self = this.set("selective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelective: Self = this.set("selective", js.undefined)
  }
}
