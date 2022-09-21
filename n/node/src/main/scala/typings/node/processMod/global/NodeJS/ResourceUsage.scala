package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUsage extends StObject {
  
  var fsRead: Double
  
  var fsWrite: Double
  
  var involuntaryContextSwitches: Double
  
  var ipcReceived: Double
  
  var ipcSent: Double
  
  var majorPageFault: Double
  
  var maxRSS: Double
  
  var minorPageFault: Double
  
  var sharedMemorySize: Double
  
  var signalsCount: Double
  
  var swappedOut: Double
  
  var systemCPUTime: Double
  
  var unsharedDataSize: Double
  
  var unsharedStackSize: Double
  
  var userCPUTime: Double
  
  var voluntaryContextSwitches: Double
}
object ResourceUsage {
  
  inline def apply(
    fsRead: Double,
    fsWrite: Double,
    involuntaryContextSwitches: Double,
    ipcReceived: Double,
    ipcSent: Double,
    majorPageFault: Double,
    maxRSS: Double,
    minorPageFault: Double,
    sharedMemorySize: Double,
    signalsCount: Double,
    swappedOut: Double,
    systemCPUTime: Double,
    unsharedDataSize: Double,
    unsharedStackSize: Double,
    userCPUTime: Double,
    voluntaryContextSwitches: Double
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUsage]
  }
  
  extension [Self <: ResourceUsage](x: Self) {
    
    inline def setFsRead(value: Double): Self = StObject.set(x, "fsRead", value.asInstanceOf[js.Any])
    
    inline def setFsWrite(value: Double): Self = StObject.set(x, "fsWrite", value.asInstanceOf[js.Any])
    
    inline def setInvoluntaryContextSwitches(value: Double): Self = StObject.set(x, "involuntaryContextSwitches", value.asInstanceOf[js.Any])
    
    inline def setIpcReceived(value: Double): Self = StObject.set(x, "ipcReceived", value.asInstanceOf[js.Any])
    
    inline def setIpcSent(value: Double): Self = StObject.set(x, "ipcSent", value.asInstanceOf[js.Any])
    
    inline def setMajorPageFault(value: Double): Self = StObject.set(x, "majorPageFault", value.asInstanceOf[js.Any])
    
    inline def setMaxRSS(value: Double): Self = StObject.set(x, "maxRSS", value.asInstanceOf[js.Any])
    
    inline def setMinorPageFault(value: Double): Self = StObject.set(x, "minorPageFault", value.asInstanceOf[js.Any])
    
    inline def setSharedMemorySize(value: Double): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
    
    inline def setSignalsCount(value: Double): Self = StObject.set(x, "signalsCount", value.asInstanceOf[js.Any])
    
    inline def setSwappedOut(value: Double): Self = StObject.set(x, "swappedOut", value.asInstanceOf[js.Any])
    
    inline def setSystemCPUTime(value: Double): Self = StObject.set(x, "systemCPUTime", value.asInstanceOf[js.Any])
    
    inline def setUnsharedDataSize(value: Double): Self = StObject.set(x, "unsharedDataSize", value.asInstanceOf[js.Any])
    
    inline def setUnsharedStackSize(value: Double): Self = StObject.set(x, "unsharedStackSize", value.asInstanceOf[js.Any])
    
    inline def setUserCPUTime(value: Double): Self = StObject.set(x, "userCPUTime", value.asInstanceOf[js.Any])
    
    inline def setVoluntaryContextSwitches(value: Double): Self = StObject.set(x, "voluntaryContextSwitches", value.asInstanceOf[js.Any])
  }
}
