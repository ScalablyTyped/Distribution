package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCLDeviceInfo extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var clDeviceVersion: String
  
  /**
    * @minVersion 23.0
    */
  var clPlatformVersion: String
  
  /**
    * @minVersion 23.0
    */
  var driverVersion: String
  
  /**
    * @minVersion 23.0
    */
  var isIntegrated: String
  
  /**
    * @minVersion 23.0
    */
  var memoryMB: Double
  
  /**
    * @minVersion 23.0
    */
  var name: String
  
  /**
    * @minVersion 23.0
    */
  var oclBandwidth: Double
  
  /**
    * @minVersion 23.0
    */
  var oclCompute: Double
  
  /**
    * @minVersion 23.0
    */
  var vendor: String
  
  /**
    * @minVersion 23.0
    */
  var version: String
}
object OpenCLDeviceInfo {
  
  inline def apply(
    clDeviceVersion: String,
    clPlatformVersion: String,
    driverVersion: String,
    isIntegrated: String,
    memoryMB: Double,
    name: String,
    oclBandwidth: Double,
    oclCompute: Double,
    vendor: String,
    version: String
  ): OpenCLDeviceInfo = {
    val __obj = js.Dynamic.literal(clDeviceVersion = clDeviceVersion.asInstanceOf[js.Any], clPlatformVersion = clPlatformVersion.asInstanceOf[js.Any], driverVersion = driverVersion.asInstanceOf[js.Any], isIntegrated = isIntegrated.asInstanceOf[js.Any], memoryMB = memoryMB.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oclBandwidth = oclBandwidth.asInstanceOf[js.Any], oclCompute = oclCompute.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCLDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCLDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setClDeviceVersion(value: String): Self = StObject.set(x, "clDeviceVersion", value.asInstanceOf[js.Any])
    
    inline def setClPlatformVersion(value: String): Self = StObject.set(x, "clPlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
    
    inline def setIsIntegrated(value: String): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
    
    inline def setMemoryMB(value: Double): Self = StObject.set(x, "memoryMB", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOclBandwidth(value: Double): Self = StObject.set(x, "oclBandwidth", value.asInstanceOf[js.Any])
    
    inline def setOclCompute(value: Double): Self = StObject.set(x, "oclCompute", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
