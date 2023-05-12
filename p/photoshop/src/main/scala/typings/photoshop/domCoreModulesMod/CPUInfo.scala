package typings.photoshop.domCoreModulesMod

import typings.photoshop.photoshopStrings.rosetta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUInfo extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var emulationMode: js.UndefOr[rosetta2] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var frequencyMhz: Double
  
  /**
    * @minVersion 23.0
    */
  var logicalCores: Double
  
  /**
    * @minVersion 23.0
    */
  var physicalCores: Double
  
  /**
    * @minVersion 23.0
    */
  var vendor: CPUVendorKind
}
object CPUInfo {
  
  inline def apply(frequencyMhz: Double, logicalCores: Double, physicalCores: Double, vendor: CPUVendorKind): CPUInfo = {
    val __obj = js.Dynamic.literal(frequencyMhz = frequencyMhz.asInstanceOf[js.Any], logicalCores = logicalCores.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPUInfo] (val x: Self) extends AnyVal {
    
    inline def setEmulationMode(value: rosetta2): Self = StObject.set(x, "emulationMode", value.asInstanceOf[js.Any])
    
    inline def setEmulationModeUndefined: Self = StObject.set(x, "emulationMode", js.undefined)
    
    inline def setFrequencyMhz(value: Double): Self = StObject.set(x, "frequencyMhz", value.asInstanceOf[js.Any])
    
    inline def setLogicalCores(value: Double): Self = StObject.set(x, "logicalCores", value.asInstanceOf[js.Any])
    
    inline def setPhysicalCores(value: Double): Self = StObject.set(x, "physicalCores", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: CPUVendorKind): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
