package typings.nodeHid

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeHid.nodeHidStrings.hidraw
import typings.nodeHid.nodeHidStrings.libusb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-hid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-hid", "HID")
  @js.native
  open class HID protected () extends EventEmitter {
    def this(path: String) = this()
    def this(vid: Double, pid: Double) = this()
    
    def close(): Unit = js.native
    
    def getFeatureReport(report_id: Double, report_length: Double): js.Array[Double] = js.native
    
    def pause(): Unit = js.native
    
    def read(callback: js.Function2[/* err */ Any, /* data */ js.Array[Double], Unit]): Unit = js.native
    
    def readSync(): js.Array[Double] = js.native
    
    def readTimeout(time_out: Double): js.Array[Double] = js.native
    
    def resume(): Unit = js.native
    
    def sendFeatureReport(data: js.Array[Double]): Double = js.native
    def sendFeatureReport(data: Buffer): Double = js.native
    
    def setNonBlocking(no_block: Boolean): Unit = js.native
    
    def write(values: js.Array[Double]): Double = js.native
    def write(values: Buffer): Double = js.native
  }
  
  inline def devices(): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("devices")().asInstanceOf[js.Array[Device]]
  inline def devices(vid: Double, pid: Double): js.Array[Device] = (^.asInstanceOf[js.Dynamic].applyDynamic("devices")(vid.asInstanceOf[js.Any], pid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Device]]
  
  inline def setDriverType(`type`: hidraw | libusb): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDriverType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Device extends StObject {
    
    var interface: Double
    
    var manufacturer: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var product: js.UndefOr[String] = js.undefined
    
    var productId: Double
    
    var release: Double
    
    var serialNumber: js.UndefOr[String] = js.undefined
    
    var usage: js.UndefOr[Double] = js.undefined
    
    var usagePage: js.UndefOr[Double] = js.undefined
    
    var vendorId: Double
  }
  object Device {
    
    inline def apply(interface: Double, productId: Double, release: Double, vendorId: Double): Device = {
      val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      inline def setInterface(value: Double): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
      
      inline def setUsagePageUndefined: Self = StObject.set(x, "usagePage", js.undefined)
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    }
  }
}
