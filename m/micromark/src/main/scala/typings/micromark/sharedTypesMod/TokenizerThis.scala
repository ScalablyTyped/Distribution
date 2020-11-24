package typings.micromark.sharedTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizerThis extends js.Object {
  
  var containerState: js.UndefOr[Record[String, _]] = js.native
  
  var events: js.Array[Event] = js.native
  
  var interrupt: js.UndefOr[Boolean] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
}
object TokenizerThis {
  
  @scala.inline
  def apply(events: js.Array[Event]): TokenizerThis = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizerThis]
  }
  
  @scala.inline
  implicit class TokenizerThisOps[Self <: TokenizerThis] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerState(value: Record[String, _]): Self = this.set("containerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerState: Self = this.set("containerState", js.undefined)
    
    @scala.inline
    def setInterrupt(value: Boolean): Self = this.set("interrupt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterrupt: Self = this.set("interrupt", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
  }
}
