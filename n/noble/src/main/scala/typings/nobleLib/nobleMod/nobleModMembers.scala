package typings
package nobleLib.nobleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", JSImport.Namespace)
@js.native
object nobleModMembers extends js.Object {
  var state: java.lang.String = js.native
  def on(event: java.lang.String, listener: js.Function): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("on")
  def on_discover(
    event: nobleLib.nobleLibStrings.discover,
    listener: js.Function1[/* peripheral */ Peripheral, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("on")
  def on_scanStart(event: nobleLib.nobleLibStrings.scanStart, listener: js.Function0[scala.Unit]): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("on")
  def on_scanStop(event: nobleLib.nobleLibStrings.scanStop, listener: js.Function0[scala.Unit]): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("on")
  def on_stateChange(
    event: nobleLib.nobleLibStrings.stateChange,
    listener: js.Function1[/* state */ java.lang.String, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def removeAllListeners(): nodeLib.eventsMod.EventEmitter = js.native
  def removeAllListeners(event: java.lang.String): nodeLib.eventsMod.EventEmitter = js.native
  def removeListener(event: java.lang.String, listener: js.Function): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_discover(
    event: nobleLib.nobleLibStrings.discover,
    listener: js.Function1[/* peripheral */ Peripheral, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_scanStart(event: nobleLib.nobleLibStrings.scanStart, listener: js.Function0[scala.Unit]): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_scanStop(event: nobleLib.nobleLibStrings.scanStop, listener: js.Function0[scala.Unit]): nodeLib.eventsMod.EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_stateChange(
    event: nobleLib.nobleLibStrings.stateChange,
    listener: js.Function1[/* state */ java.lang.String, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def startScanning(): scala.Unit = js.native
  def startScanning(callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Unit = js.native
  def startScanning(serviceUUIDs: js.Array[java.lang.String]): scala.Unit = js.native
  def startScanning(serviceUUIDs: js.Array[java.lang.String], allowDuplicates: scala.Boolean): scala.Unit = js.native
  def startScanning(
    serviceUUIDs: js.Array[java.lang.String],
    allowDuplicates: scala.Boolean,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def startScanning(
    serviceUUIDs: js.Array[java.lang.String],
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def stopScanning(): scala.Unit = js.native
  def stopScanning(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

