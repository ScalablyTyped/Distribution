package typings.nodeHid

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeHid.nodeHidStrings.hidraw
import typings.nodeHid.nodeHidStrings.libusb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-hid", "HID")
  @js.native
  class HID protected () extends EventEmitter {
    def this(path: String) = this()
    def this(vid: Double, pid: Double) = this()
    
    def close(): Unit = js.native
    
    def getFeatureReport(report_id: Double, report_length: Double): js.Array[Double] = js.native
    
    def pause(): Unit = js.native
    
    def read(callback: js.Function2[/* err */ js.Any, /* data */ js.Array[Double], Unit]): Unit = js.native
    
    def readSync(): js.Array[Double] = js.native
    
    def readTimeout(time_out: Double): js.Array[Double] = js.native
    
    def resume(): Unit = js.native
    
    def sendFeatureReport(data: js.Array[Double]): Double = js.native
    def sendFeatureReport(data: Buffer): Double = js.native
    
    def setNonBlocking(no_block: Boolean): Unit = js.native
    
    def write(values: js.Array[Double]): Double = js.native
    def write(values: Buffer): Double = js.native
  }
  
  @JSImport("node-hid", "devices")
  @js.native
  def devices(): js.Array[Device] = js.native
  @JSImport("node-hid", "devices")
  @js.native
  def devices(vid: Double, pid: Double): js.Array[Device] = js.native
  
  @JSImport("node-hid", "setDriverType")
  @js.native
  def setDriverType_hidraw(`type`: hidraw): Unit = js.native
  @JSImport("node-hid", "setDriverType")
  @js.native
  def setDriverType_libusb(`type`: libusb): Unit = js.native
  
  @js.native
  trait Device extends StObject {
    
    var interface: Double = js.native
    
    var manufacturer: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var product: js.UndefOr[String] = js.native
    
    var productId: Double = js.native
    
    var release: Double = js.native
    
    var serialNumber: js.UndefOr[String] = js.native
    
    var usage: js.UndefOr[Double] = js.native
    
    var usagePage: js.UndefOr[Double] = js.native
    
    var vendorId: Double = js.native
  }
  object Device {
    
    @scala.inline
    def apply(interface: Double, productId: Double, release: Double, vendorId: Double): Device = {
      val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterface(value: Double): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      @scala.inline
      def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsagePageUndefined: Self = StObject.set(x, "usagePage", js.undefined)
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      @scala.inline
      def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    }
  }
}
