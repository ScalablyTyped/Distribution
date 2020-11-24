package typings.nobleMac.mod

import typings.nobleMac.nobleMacStrings.connect
import typings.nobleMac.nobleMacStrings.connected
import typings.nobleMac.nobleMacStrings.connecting
import typings.nobleMac.nobleMacStrings.disconnect
import typings.nobleMac.nobleMacStrings.disconnected
import typings.nobleMac.nobleMacStrings.disconnecting
import typings.nobleMac.nobleMacStrings.error
import typings.nobleMac.nobleMacStrings.rssiUpdate
import typings.nobleMac.nobleMacStrings.servicesDiscover
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("noble-mac", "Peripheral")
@js.native
class Peripheral () extends EventEmitter {
  
  var address: String = js.native
  
  var addressType: String = js.native
  
  var advertisement: Advertisement = js.native
  
  def connect(): Unit = js.native
  def connect(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  var connectable: Boolean = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  
  def discoverAllServicesAndCharacteristics(): Unit = js.native
  def discoverAllServicesAndCharacteristics(
    callback: js.Function3[
      /* error */ String, 
      /* services */ js.Array[Service], 
      /* characteristics */ js.Array[Characteristic], 
      Unit
    ]
  ): Unit = js.native
  
  def discoverServices(serviceUUIDs: js.Array[String]): Unit = js.native
  def discoverServices(
    serviceUUIDs: js.Array[String],
    callback: js.Function2[/* error */ String, /* services */ js.Array[Service], Unit]
  ): Unit = js.native
  
  def discoverSomeServicesAndCharacteristics(serviceUUIDs: js.Array[String], characteristicUUIDs: js.Array[String]): Unit = js.native
  def discoverSomeServicesAndCharacteristics(
    serviceUUIDs: js.Array[String],
    characteristicUUIDs: js.Array[String],
    callback: js.Function3[
      /* error */ String, 
      /* services */ js.Array[Service], 
      /* characteristics */ js.Array[Characteristic], 
      Unit
    ]
  ): Unit = js.native
  
  var id: String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_rssiUpdate(event: rssiUpdate, listener: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_servicesDiscover(event: servicesDiscover, listener: js.Function1[/* services */ js.Array[Service], Unit]): this.type = js.native
  
  def readHandle(handle: Buffer, callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
  
  var rssi: Double = js.native
  
  var services: js.Array[Service] = js.native
  
  var state: error | connecting | connected | disconnecting | disconnected = js.native
  
  def updateRssi(): Unit = js.native
  def updateRssi(callback: js.Function2[/* error */ String, /* rssi */ Double, Unit]): Unit = js.native
  
  var uuid: String = js.native
  
  def writeHandle(
    handle: Buffer,
    data: Buffer,
    withoutResponse: Boolean,
    callback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
}
