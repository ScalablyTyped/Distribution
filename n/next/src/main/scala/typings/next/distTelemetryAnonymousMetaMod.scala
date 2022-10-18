package typings.next

import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryAnonymousMetaMod {
  
  @JSImport("next/dist/telemetry/anonymous-meta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnonymousMeta(): AnonymousMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnonymousMeta")().asInstanceOf[AnonymousMeta]
  
  trait AnonymousMeta extends StObject {
    
    var ciName: String | Null
    
    var cpuCount: Double
    
    var cpuModel: String | Null
    
    var cpuSpeed: Double | Null
    
    var isCI: Boolean
    
    var isDocker: Boolean
    
    var isNowDev: Boolean
    
    var isWsl: Boolean
    
    var memoryInMb: Double
    
    var nextVersion: String
    
    var systemArchitecture: String
    
    var systemPlatform: Platform
    
    var systemRelease: String
  }
  object AnonymousMeta {
    
    inline def apply(
      cpuCount: Double,
      isCI: Boolean,
      isDocker: Boolean,
      isNowDev: Boolean,
      isWsl: Boolean,
      memoryInMb: Double,
      nextVersion: String,
      systemArchitecture: String,
      systemPlatform: Platform,
      systemRelease: String
    ): AnonymousMeta = {
      val __obj = js.Dynamic.literal(cpuCount = cpuCount.asInstanceOf[js.Any], isCI = isCI.asInstanceOf[js.Any], isDocker = isDocker.asInstanceOf[js.Any], isNowDev = isNowDev.asInstanceOf[js.Any], isWsl = isWsl.asInstanceOf[js.Any], memoryInMb = memoryInMb.asInstanceOf[js.Any], nextVersion = nextVersion.asInstanceOf[js.Any], systemArchitecture = systemArchitecture.asInstanceOf[js.Any], systemPlatform = systemPlatform.asInstanceOf[js.Any], systemRelease = systemRelease.asInstanceOf[js.Any], ciName = null, cpuModel = null, cpuSpeed = null)
      __obj.asInstanceOf[AnonymousMeta]
    }
    
    extension [Self <: AnonymousMeta](x: Self) {
      
      inline def setCiName(value: String): Self = StObject.set(x, "ciName", value.asInstanceOf[js.Any])
      
      inline def setCiNameNull: Self = StObject.set(x, "ciName", null)
      
      inline def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
      
      inline def setCpuModel(value: String): Self = StObject.set(x, "cpuModel", value.asInstanceOf[js.Any])
      
      inline def setCpuModelNull: Self = StObject.set(x, "cpuModel", null)
      
      inline def setCpuSpeed(value: Double): Self = StObject.set(x, "cpuSpeed", value.asInstanceOf[js.Any])
      
      inline def setCpuSpeedNull: Self = StObject.set(x, "cpuSpeed", null)
      
      inline def setIsCI(value: Boolean): Self = StObject.set(x, "isCI", value.asInstanceOf[js.Any])
      
      inline def setIsDocker(value: Boolean): Self = StObject.set(x, "isDocker", value.asInstanceOf[js.Any])
      
      inline def setIsNowDev(value: Boolean): Self = StObject.set(x, "isNowDev", value.asInstanceOf[js.Any])
      
      inline def setIsWsl(value: Boolean): Self = StObject.set(x, "isWsl", value.asInstanceOf[js.Any])
      
      inline def setMemoryInMb(value: Double): Self = StObject.set(x, "memoryInMb", value.asInstanceOf[js.Any])
      
      inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
      
      inline def setSystemArchitecture(value: String): Self = StObject.set(x, "systemArchitecture", value.asInstanceOf[js.Any])
      
      inline def setSystemPlatform(value: Platform): Self = StObject.set(x, "systemPlatform", value.asInstanceOf[js.Any])
      
      inline def setSystemRelease(value: String): Self = StObject.set(x, "systemRelease", value.asInstanceOf[js.Any])
    }
  }
}
