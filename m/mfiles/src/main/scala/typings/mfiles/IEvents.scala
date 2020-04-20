package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvents extends js.Object {
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
}

