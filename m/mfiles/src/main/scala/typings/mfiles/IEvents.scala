package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvents extends js.Object {
  // tslint:disable-next-line ban-types
  def Register(eventToListen: Event, eventSink: js.Function): Double = js.native
  def Unregister(sinkHandle: Double): Unit = js.native
}

object IEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IEvents]
  }
  @scala.inline
  implicit class IEventsOps[Self <: IEvents] (val x: Self) extends AnyVal {
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
    def setRegister(value: (Event, js.Function) => Double): Self = this.set("Register", js.Any.fromFunction2(value))
    @scala.inline
    def setUnregister(value: Double => Unit): Self = this.set("Unregister", js.Any.fromFunction1(value))
  }
  
}

