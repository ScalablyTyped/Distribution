package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayConfiguration extends StObject {
  
  var globalBounds: DisplayConfigurationBounds
  
  var globalWorkingBounds: DisplayConfigurationBounds
  
  var isPrimary: Boolean
  
  var physicalResolution: DisplayConfigurationPhysical
  
  var scaleFactor: Double
}
object DisplayConfiguration {
  
  inline def apply(
    globalBounds: DisplayConfigurationBounds,
    globalWorkingBounds: DisplayConfigurationBounds,
    isPrimary: Boolean,
    physicalResolution: DisplayConfigurationPhysical,
    scaleFactor: Double
  ): DisplayConfiguration = {
    val __obj = js.Dynamic.literal(globalBounds = globalBounds.asInstanceOf[js.Any], globalWorkingBounds = globalWorkingBounds.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], physicalResolution = physicalResolution.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGlobalBounds(value: DisplayConfigurationBounds): Self = StObject.set(x, "globalBounds", value.asInstanceOf[js.Any])
    
    inline def setGlobalWorkingBounds(value: DisplayConfigurationBounds): Self = StObject.set(x, "globalWorkingBounds", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResolution(value: DisplayConfigurationPhysical): Self = StObject.set(x, "physicalResolution", value.asInstanceOf[js.Any])
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
  }
}
