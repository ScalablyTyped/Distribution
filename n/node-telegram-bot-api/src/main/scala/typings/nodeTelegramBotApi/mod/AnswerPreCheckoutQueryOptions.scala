package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerPreCheckoutQueryOptions extends js.Object {
  
  var error_message: js.UndefOr[String] = js.native
}
object AnswerPreCheckoutQueryOptions {
  
  @scala.inline
  def apply(): AnswerPreCheckoutQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerPreCheckoutQueryOptions]
  }
  
  @scala.inline
  implicit class AnswerPreCheckoutQueryOptionsOps[Self <: AnswerPreCheckoutQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_message: Self = this.set("error_message", js.undefined)
  }
}
