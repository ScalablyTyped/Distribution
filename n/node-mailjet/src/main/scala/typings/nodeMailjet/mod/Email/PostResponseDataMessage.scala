package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResponseDataMessage extends js.Object {
  
  val Bcc: js.Array[PostResponseDataTo] = js.native
  
  val Cc: js.Array[PostResponseDataTo] = js.native
  
  val CustomID: String = js.native
  
  val Status: String = js.native
  
  val To: js.Array[PostResponseDataTo] = js.native
}
object PostResponseDataMessage {
  
  @scala.inline
  def apply(
    Bcc: js.Array[PostResponseDataTo],
    Cc: js.Array[PostResponseDataTo],
    CustomID: String,
    Status: String,
    To: js.Array[PostResponseDataTo]
  ): PostResponseDataMessage = {
    val __obj = js.Dynamic.literal(Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CustomID = CustomID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataMessage]
  }
  
  @scala.inline
  implicit class PostResponseDataMessageOps[Self <: PostResponseDataMessage] (val x: Self) extends AnyVal {
    
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
    def setBccVarargs(value: PostResponseDataTo*): Self = this.set("Bcc", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: js.Array[PostResponseDataTo]): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcVarargs(value: PostResponseDataTo*): Self = this.set("Cc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: js.Array[PostResponseDataTo]): Self = this.set("Cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomID(value: String): Self = this.set("CustomID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: PostResponseDataTo*): Self = this.set("To", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[PostResponseDataTo]): Self = this.set("To", value.asInstanceOf[js.Any])
  }
}
