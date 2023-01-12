package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfo extends StObject {
  
  var NewAvailableFlash: Double
  
  var NewCPUUtilization: Double
  
  var NewMemoryUtilization: Double
  
  var NewPhysicalFlash: Double
  
  var NewPhysicalMemory: Double
}
object SystemInfo {
  
  inline def apply(
    NewAvailableFlash: Double,
    NewCPUUtilization: Double,
    NewMemoryUtilization: Double,
    NewPhysicalFlash: Double,
    NewPhysicalMemory: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(NewAvailableFlash = NewAvailableFlash.asInstanceOf[js.Any], NewCPUUtilization = NewCPUUtilization.asInstanceOf[js.Any], NewMemoryUtilization = NewMemoryUtilization.asInstanceOf[js.Any], NewPhysicalFlash = NewPhysicalFlash.asInstanceOf[js.Any], NewPhysicalMemory = NewPhysicalMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfo] (val x: Self) extends AnyVal {
    
    inline def setNewAvailableFlash(value: Double): Self = StObject.set(x, "NewAvailableFlash", value.asInstanceOf[js.Any])
    
    inline def setNewCPUUtilization(value: Double): Self = StObject.set(x, "NewCPUUtilization", value.asInstanceOf[js.Any])
    
    inline def setNewMemoryUtilization(value: Double): Self = StObject.set(x, "NewMemoryUtilization", value.asInstanceOf[js.Any])
    
    inline def setNewPhysicalFlash(value: Double): Self = StObject.set(x, "NewPhysicalFlash", value.asInstanceOf[js.Any])
    
    inline def setNewPhysicalMemory(value: Double): Self = StObject.set(x, "NewPhysicalMemory", value.asInstanceOf[js.Any])
  }
}
