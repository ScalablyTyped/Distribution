package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLog extends StObject {
  
  def init(): Unit
  
  def log(id: js.Any, payload: js.Object): Unit
  
  def show(): Unit
  
  def startEvent(name: String): Unit
}
object EventLog {
  
  @scala.inline
  def apply(init: () => Unit, log: (js.Any, js.Object) => Unit, show: () => Unit, startEvent: String => Unit): EventLog = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), log = js.Any.fromFunction2(log), show = js.Any.fromFunction0(show), startEvent = js.Any.fromFunction1(startEvent))
    __obj.asInstanceOf[EventLog]
  }
  
  @scala.inline
  implicit class EventLogMutableBuilder[Self <: EventLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: (js.Any, js.Object) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartEvent(value: String => Unit): Self = StObject.set(x, "startEvent", js.Any.fromFunction1(value))
  }
}
