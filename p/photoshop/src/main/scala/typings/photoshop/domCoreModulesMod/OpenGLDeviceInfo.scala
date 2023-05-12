package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGLDeviceInfo extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var driverVersion: String
  
  /**
    * @minVersion 23.0
    */
  var glDriver: String
  
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
  var vendor: String
  
  /**
    * @minVersion 23.0
    */
  var version: String
}
object OpenGLDeviceInfo {
  
  inline def apply(
    driverVersion: String,
    glDriver: String,
    isIntegrated: String,
    memoryMB: Double,
    name: String,
    vendor: String,
    version: String
  ): OpenGLDeviceInfo = {
    val __obj = js.Dynamic.literal(driverVersion = driverVersion.asInstanceOf[js.Any], glDriver = glDriver.asInstanceOf[js.Any], isIntegrated = isIntegrated.asInstanceOf[js.Any], memoryMB = memoryMB.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGLDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenGLDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
    
    inline def setGlDriver(value: String): Self = StObject.set(x, "glDriver", value.asInstanceOf[js.Any])
    
    inline def setIsIntegrated(value: String): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
    
    inline def setMemoryMB(value: Double): Self = StObject.set(x, "memoryMB", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
