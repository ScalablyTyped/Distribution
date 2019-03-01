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
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit]
  ): IEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    __obj.asInstanceOf[IEvents]
  }
}

