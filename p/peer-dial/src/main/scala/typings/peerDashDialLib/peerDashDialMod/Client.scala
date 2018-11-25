package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peer-dial", "Client")
@js.native
class Client ()
  extends eventsLib.eventsMod.EventEmitter {
  def getDialDevice(deviceDescriptionUrl: java.lang.String): scala.Unit = js.native
  def getDialDevice(
    deviceDescriptionUrl: java.lang.String,
    callback: js.Function2[/* data */ DialDevice, /* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

