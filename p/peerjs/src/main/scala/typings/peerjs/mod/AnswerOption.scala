package typings.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerOption extends js.Object {
  
  var sdpTransform: js.UndefOr[js.Function] = js.native
}
object AnswerOption {
  
  @scala.inline
  def apply(): AnswerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOption]
  }
  
  @scala.inline
  implicit class AnswerOptionOps[Self <: AnswerOption] (val x: Self) extends AnyVal {
    
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
    def setSdpTransform(value: js.Function): Self = this.set("sdpTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdpTransform: Self = this.set("sdpTransform", js.undefined)
  }
}
