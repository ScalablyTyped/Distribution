package typings
package nobleDashMacLib.nobleDashMacMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "Characteristic")
@js.native
class Characteristic ()
  extends nodeLib.eventsMod.EventEmitter {
  var descriptors: js.Array[Descriptor] = js.native
  var name: java.lang.String = js.native
  var properties: js.Array[java.lang.String] = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  def broadcast(broadcast: scala.Boolean): scala.Unit = js.native
  def broadcast(broadcast: scala.Boolean, callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def discoverDescriptors(): scala.Unit = js.native
  def discoverDescriptors(
    callback: js.Function2[/* error */ java.lang.String, /* descriptors */ js.Array[Descriptor], scala.Unit]
  ): scala.Unit = js.native
  def notify(notify: scala.Boolean): scala.Unit = js.native
  def notify(notify: scala.Boolean, callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: java.lang.String, option: scala.Boolean, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_broadcast(
    event: nobleDashMacLib.nobleDashMacLibStrings.broadcast,
    listener: js.Function1[/* state */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_descriptorsDiscover(
    event: nobleDashMacLib.nobleDashMacLibStrings.descriptorsDiscover,
    listener: js.Function1[/* descriptors */ js.Array[Descriptor], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    event: nobleDashMacLib.nobleDashMacLibStrings.notify,
    listener: js.Function1[/* state */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_read(
    event: nobleDashMacLib.nobleDashMacLibStrings.read,
    listener: js.Function2[/* data */ nodeLib.Buffer, /* isNotification */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_write(
    event: nobleDashMacLib.nobleDashMacLibStrings.write,
    withoutResponse: scala.Boolean,
    listener: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def read(): scala.Unit = js.native
  def read(callback: js.Function2[/* error */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def write(data: nodeLib.Buffer, notify: scala.Boolean): scala.Unit = js.native
  def write(
    data: nodeLib.Buffer,
    notify: scala.Boolean,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

