package typings.nobleDashMac.nobleDashMacMod

import typings.nobleDashMac.nobleDashMacStrings.discover
import typings.nobleDashMac.nobleDashMacStrings.scanStart
import typings.nobleDashMac.nobleDashMacStrings.scanStop
import typings.nobleDashMac.nobleDashMacStrings.stateChange
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val state: String = js.native
  def on(event: String, listener: js.Function): EventEmitter = js.native
  @JSName("on")
  def on_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSName("on")
  def on_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSName("on")
  def on_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: String): EventEmitter = js.native
  def removeListener(event: String, listener: js.Function): EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSName("removeListener")
  def removeListener_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  def startScanning(): Unit = js.native
  def startScanning(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def startScanning(serviceUUIDs: js.Array[String]): Unit = js.native
  def startScanning(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = js.native
  def startScanning(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def startScanning(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def stopScanning(): Unit = js.native
  def stopScanning(callback: js.Function0[Unit]): Unit = js.native
}

