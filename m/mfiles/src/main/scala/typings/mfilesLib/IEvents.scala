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

