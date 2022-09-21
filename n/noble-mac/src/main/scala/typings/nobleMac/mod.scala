package typings.nobleMac

import typings.nobleMac.anon.Data
import typings.nobleMac.nobleMacStrings.broadcast
import typings.nobleMac.nobleMacStrings.characteristicsDiscover
import typings.nobleMac.nobleMacStrings.connect
import typings.nobleMac.nobleMacStrings.connected
import typings.nobleMac.nobleMacStrings.connecting
import typings.nobleMac.nobleMacStrings.descriptorsDiscover
import typings.nobleMac.nobleMacStrings.disconnect
import typings.nobleMac.nobleMacStrings.disconnected
import typings.nobleMac.nobleMacStrings.disconnecting
import typings.nobleMac.nobleMacStrings.discover
import typings.nobleMac.nobleMacStrings.error
import typings.nobleMac.nobleMacStrings.includedServicesDiscover
import typings.nobleMac.nobleMacStrings.notify
import typings.nobleMac.nobleMacStrings.read
import typings.nobleMac.nobleMacStrings.rssiUpdate
import typings.nobleMac.nobleMacStrings.scanStart
import typings.nobleMac.nobleMacStrings.scanStop
import typings.nobleMac.nobleMacStrings.servicesDiscover
import typings.nobleMac.nobleMacStrings.stateChange
import typings.nobleMac.nobleMacStrings.valueRead
import typings.nobleMac.nobleMacStrings.valueWrite
import typings.nobleMac.nobleMacStrings.write
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noble-mac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noble-mac", "Characteristic")
  @js.native
  open class Characteristic () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def broadcast(broadcast: Boolean): Unit = js.native
    def broadcast(broadcast: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var descriptors: js.Array[Descriptor] = js.native
    
    def discoverDescriptors(): Unit = js.native
    def discoverDescriptors(callback: js.Function2[/* error */ String, /* descriptors */ js.Array[Descriptor], Unit]): Unit = js.native
    
    var name: String = js.native
    
    def notify(notify: Boolean): Unit = js.native
    def notify(notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    def on(event: broadcast | notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("on")
    def on_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
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
  
  @JSImport("noble-mac", "Descriptor")
  @js.native
  open class Descriptor () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def readValue(): Unit = js.native
    def readValue(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    def writeValue(data: Buffer): Unit = js.native
    def writeValue(data: Buffer, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble-mac", "Peripheral")
  @js.native
  open class Peripheral () extends EventEmitter {
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
    
    def on(event: connect | disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    def on(event: String, listener: js.Function): this.type = js.native
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
  
  @JSImport("noble-mac", "Service")
  @js.native
  open class Service () extends EventEmitter {
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
    
    var `type`: String = js.native
    
    var uuid: String = js.native
  }
  
  inline def on(event: scanStart | scanStop, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  inline def on(event: String, listener: js.Function): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeAllListeners(): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[EventEmitter]
  inline def removeAllListeners(event: String): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  inline def removeListener(event: scanStart | scanStop, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  inline def removeListener(event: String, listener: js.Function): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def startScanning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")().asInstanceOf[Unit]
  inline def startScanning(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], allowDuplicates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startScanning(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], allowDuplicates.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("noble-mac", "state")
  @js.native
  val state: String = js.native
  
  inline def stopScanning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopScanning")().asInstanceOf[Unit]
  inline def stopScanning(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopScanning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Advertisement extends StObject {
    
    var localName: String
    
    var manufacturerData: Buffer
    
    var serviceData: Data
    
    var serviceUuids: js.Array[String]
    
    var txPowerLevel: Double
  }
  object Advertisement {
    
    inline def apply(
      localName: String,
      manufacturerData: Buffer,
      serviceData: Data,
      serviceUuids: js.Array[String],
      txPowerLevel: Double
    ): Advertisement = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    extension [Self <: Advertisement](x: Self) {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setManufacturerData(value: Buffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      inline def setServiceData(value: Data): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      inline def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      inline def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value*))
      
      inline def setTxPowerLevel(value: Double): Self = StObject.set(x, "txPowerLevel", value.asInstanceOf[js.Any])
    }
  }
}
