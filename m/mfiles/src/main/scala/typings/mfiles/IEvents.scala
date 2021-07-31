package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvents extends StObject {
  
  // tslint:disable-next-line ban-types
  def Register(eventToListen: Event, eventSink: js.Function): Double
  
  def Unregister(sinkHandle: Double): Unit
}
object IEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IEvents]
  }
  
  @scala.inline
  implicit class IEventsMutableBuilder[Self <: IEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegister(value: (Event, js.Function) => Double): Self = StObject.set(x, "Register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister(value: Double => Unit): Self = StObject.set(x, "Unregister", js.Any.fromFunction1(value))
  }
}
