package typings
package nobleLib.nobleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "Peripheral")
@js.native
class Peripheral ()
  extends nodeLib.eventsMod.EventEmitter {
  var address: java.lang.String = js.native
  var addressType: java.lang.String = js.native
  var advertisement: Advertisement = js.native
  var connectable: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var rssi: scala.Double = js.native
  var services: js.Array[Service] = js.native
  var state: nobleLib.nobleLibStrings.error | nobleLib.nobleLibStrings.connecting | nobleLib.nobleLibStrings.connected | nobleLib.nobleLibStrings.disconnecting | nobleLib.nobleLibStrings.disconnected = js.native
  var uuid: java.lang.String = js.native
  def connect(): scala.Unit = js.native
  def connect(callback: js.Function1[/* error */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def discoverAllServicesAndCharacteristics(): scala.Unit = js.native
  def discoverAllServicesAndCharacteristics(
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* services */ js.Array[Service], 
      /* characteristics */ js.Array[Characteristic], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def discoverServices(serviceUUIDs: js.Array[java.lang.String]): scala.Unit = js.native
  def discoverServices(
    serviceUUIDs: js.Array[java.lang.String],
    callback: js.Function2[/* error */ java.lang.String, /* services */ js.Array[Service], scala.Unit]
  ): scala.Unit = js.native
  def discoverSomeServicesAndCharacteristics(serviceUUIDs: js.Array[java.lang.String], characteristicUUIDs: js.Array[java.lang.String]): scala.Unit = js.native
  def discoverSomeServicesAndCharacteristics(
    serviceUUIDs: js.Array[java.lang.String],
    characteristicUUIDs: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* services */ js.Array[Service], 
      /* characteristics */ js.Array[Characteristic], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connect(
    event: nobleLib.nobleLibStrings.connect,
    listener: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: nobleLib.nobleLibStrings.disconnect,
    listener: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rssiUpdate(
    event: nobleLib.nobleLibStrings.rssiUpdate,
    listener: js.Function1[/* rssi */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_servicesDiscover(
    event: nobleLib.nobleLibStrings.servicesDiscover,
    listener: js.Function1[/* services */ js.Array[Service], scala.Unit]
  ): this.type = js.native
  def readHandle(
    handle: nodeLib.Buffer,
    callback: js.Function2[/* error */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def updateRssi(): scala.Unit = js.native
  def updateRssi(callback: js.Function2[/* error */ java.lang.String, /* rssi */ scala.Double, scala.Unit]): scala.Unit = js.native
  def writeHandle(
    handle: nodeLib.Buffer,
    data: nodeLib.Buffer,
    withoutResponse: scala.Boolean,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

