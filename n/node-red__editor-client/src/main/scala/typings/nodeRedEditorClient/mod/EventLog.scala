package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLog extends js.Object {
  
  def init(): Unit = js.native
  
  def log(id: js.Any, payload: js.Object): Unit = js.native
  
  def show(): Unit = js.native
  
  def startEvent(name: String): Unit = js.native
}
object EventLog {
  
  @scala.inline
  def apply(init: () => Unit, log: (js.Any, js.Object) => Unit, show: () => Unit, startEvent: String => Unit): EventLog = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), log = js.Any.fromFunction2(log), show = js.Any.fromFunction0(show), startEvent = js.Any.fromFunction1(startEvent))
    __obj.asInstanceOf[EventLog]
  }
  
  @scala.inline
  implicit class EventLogOps[Self <: EventLog] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: (js.Any, js.Object) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartEvent(value: String => Unit): Self = this.set("startEvent", js.Any.fromFunction1(value))
  }
}
