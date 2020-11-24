package typings.postRobot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMessageEvent extends js.Object {
  
  var data: js.Object = js.native
  
  var origin: String = js.native
  
  var source: CrossDomainWindowType = js.native
}
object ResponseMessageEvent {
  
  @scala.inline
  def apply(data: js.Object, origin: String): ResponseMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMessageEvent]
  }
  
  @scala.inline
  implicit class ResponseMessageEventOps[Self <: ResponseMessageEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: CrossDomainWindowType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
}
