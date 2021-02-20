package typings.noble

import typings.noble.anon.Data
import typings.noble.nobleStrings.broadcast
import typings.noble.nobleStrings.characteristicsDiscover
import typings.noble.nobleStrings.connect
import typings.noble.nobleStrings.connected
import typings.noble.nobleStrings.connecting
import typings.noble.nobleStrings.descriptorsDiscover
import typings.noble.nobleStrings.disconnect
import typings.noble.nobleStrings.disconnected
import typings.noble.nobleStrings.disconnecting
import typings.noble.nobleStrings.discover
import typings.noble.nobleStrings.error
import typings.noble.nobleStrings.includedServicesDiscover
import typings.noble.nobleStrings.notify
import typings.noble.nobleStrings.read
import typings.noble.nobleStrings.rssiUpdate
import typings.noble.nobleStrings.scanStart
import typings.noble.nobleStrings.scanStop
import typings.noble.nobleStrings.servicesDiscover
import typings.noble.nobleStrings.stateChange
import typings.noble.nobleStrings.valueRead
import typings.noble.nobleStrings.valueWrite
import typings.noble.nobleStrings.write
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noble", "Characteristic")
  @js.native
  class Characteristic () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def broadcast(broadcast: Boolean): Unit = js.native
    def broadcast(broadcast: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var descriptors: js.Array[Descriptor] = js.native
    
    def discoverDescriptors(): Unit = js.native
    def discoverDescriptors(callback: js.Function2[/* error */ String, /* descriptors */ js.Array[Descriptor], Unit]): Unit = js.native
    
    var name: String = js.native
    
    def notify(notify: Boolean): Unit = js.native
    def notify(notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("on")
    def on_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    def once(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("once")
    def once_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("once")
    def once_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    var properties: js.Array[String] = js.native
    
    def read(): Unit = js.native
    def read(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var uuid: String = js.native
    
    def write(data: Buffer, notify: Boolean): Unit = js.native
    def write(data: Buffer, notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble", "Descriptor")
  @js.native
  class Descriptor () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("once")
    def once_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def readValue(): Unit = js.native
    def readValue(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    def writeValue(data: Buffer): Unit = js.native
    def writeValue(data: Buffer, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble", "Peripheral")
  @js.native
  class Peripheral () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
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
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_rssiUpdate(event: rssiUpdate, listener: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_servicesDiscover(event: servicesDiscover, listener: js.Function1[/* services */ js.Array[Service], Unit]): this.type = js.native
    
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
  
  @JSImport("noble", "Service")
  @js.native
  class Service () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var characteristics: js.Array[Characteristic] = js.native
    
    def discoverCharacteristics(characteristicUUIDs: js.Array[String]): Unit = js.native
    def discoverCharacteristics(
      characteristicUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* characteristics */ js.Array[Characteristic], Unit]
    ): Unit = js.native
    
    def discoverIncludedServices(serviceUUIDs: js.Array[String]): Unit = js.native
    def discoverIncludedServices(
      serviceUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* includedServiceUuids */ js.Array[String], Unit]
    ): Unit = js.native
    
    var includedServiceUuids: js.Array[String] = js.native
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_characteristicsDiscover(
      event: characteristicsDiscover,
      listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_includedServicesDiscover(
      event: includedServicesDiscover,
      listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
    ): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_characteristicsDiscover(
      event: characteristicsDiscover,
      listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_includedServicesDiscover(
      event: includedServicesDiscover,
      listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
    ): this.type = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
  }
  
  @JSImport("noble", "on")
  @js.native
  def on(event: String, listener: js.Function): EventEmitter = js.native
  @JSImport("noble", "on")
  @js.native
  def on_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSImport("noble", "on")
  @js.native
  def on_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "on")
  @js.native
  def on_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "on")
  @js.native
  def on_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  
  @JSImport("noble", "once")
  @js.native
  def once(event: String, listener: js.Function): EventEmitter = js.native
  @JSImport("noble", "once")
  @js.native
  def once_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSImport("noble", "once")
  @js.native
  def once_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "once")
  @js.native
  def once_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "once")
  @js.native
  def once_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  
  @JSImport("noble", "removeAllListeners")
  @js.native
  def removeAllListeners(): EventEmitter = js.native
  @JSImport("noble", "removeAllListeners")
  @js.native
  def removeAllListeners(event: String): EventEmitter = js.native
  
  @JSImport("noble", "removeListener")
  @js.native
  def removeListener(event: String, listener: js.Function): EventEmitter = js.native
  @JSImport("noble", "removeListener")
  @js.native
  def removeListener_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSImport("noble", "removeListener")
  @js.native
  def removeListener_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "removeListener")
  @js.native
  def removeListener_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble", "removeListener")
  @js.native
  def removeListener_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(): Unit = js.native
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String]): Unit = js.native
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = js.native
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSImport("noble", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  
  @JSImport("noble", "state")
  @js.native
  def state: String = js.native
  @scala.inline
  def state_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  
  @JSImport("noble", "stopScanning")
  @js.native
  def stopScanning(): Unit = js.native
  @JSImport("noble", "stopScanning")
  @js.native
  def stopScanning(callback: js.Function0[Unit]): Unit = js.native
  
  @js.native
  trait Advertisement extends StObject {
    
    var localName: String = js.native
    
    var manufacturerData: Buffer = js.native
    
    var serviceData: js.Array[Data] = js.native
    
    var serviceUuids: js.Array[String] = js.native
    
    var txPowerLevel: Double = js.native
  }
  object Advertisement {
    
    @scala.inline
    def apply(
      localName: String,
      manufacturerData: Buffer,
      serviceData: js.Array[Data],
      serviceUuids: js.Array[String],
      txPowerLevel: Double
    ): Advertisement = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    @scala.inline
    implicit class AdvertisementMutableBuilder[Self <: Advertisement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerData(value: Buffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceData(value: js.Array[Data]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceDataVarargs(value: Data*): Self = StObject.set(x, "serviceData", js.Array(value :_*))
      
      @scala.inline
      def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
      
      @scala.inline
      def setTxPowerLevel(value: Double): Self = StObject.set(x, "txPowerLevel", value.asInstanceOf[js.Any])
    }
  }
}
