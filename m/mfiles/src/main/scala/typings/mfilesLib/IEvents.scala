package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvents extends js.Object {
  // tslint:disable-next-line ban-types
  def Register(eventToListen: mfilesLib.MFilesNs.Event, eventSink: js.Function): scala.Double
  def Unregister(sinkHandle: scala.Double): scala.Unit
}

object IEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit
  ): IEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
  
    __obj.asInstanceOf[IEvents]
  }
}

