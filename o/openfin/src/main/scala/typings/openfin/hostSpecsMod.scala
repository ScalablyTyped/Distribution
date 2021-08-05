package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostSpecsMod {
  
  trait CpuInfo extends StObject {
    
    var model: String
    
    var speed: Double
    
    var times: Time
  }
  object CpuInfo {
    
    inline def apply(model: String, speed: Double, times: Time): CpuInfo = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    extension [Self <: CpuInfo](x: Self) {
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setTimes(value: Time): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  trait GpuInfo extends StObject {
    
    var name: String
  }
  object GpuInfo {
    
    inline def apply(name: String): GpuInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GpuInfo]
    }
    
    extension [Self <: GpuInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostSpecs extends StObject {
    
    var aeroGlassEnabled: js.UndefOr[Boolean] = js.undefined
    
    var arch: String
    
    var cpus: js.Array[CpuInfo]
    
    var gpu: GpuInfo
    
    var memory: Double
    
    var name: String
    
    var screenSaver: js.UndefOr[Boolean] = js.undefined
  }
  object HostSpecs {
    
    inline def apply(arch: String, cpus: js.Array[CpuInfo], gpu: GpuInfo, memory: Double, name: String): HostSpecs = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostSpecs]
    }
    
    extension [Self <: HostSpecs](x: Self) {
      
      inline def setAeroGlassEnabled(value: Boolean): Self = StObject.set(x, "aeroGlassEnabled", value.asInstanceOf[js.Any])
      
      inline def setAeroGlassEnabledUndefined: Self = StObject.set(x, "aeroGlassEnabled", js.undefined)
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setCpus(value: js.Array[CpuInfo]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
      
      inline def setCpusVarargs(value: CpuInfo*): Self = StObject.set(x, "cpus", js.Array(value :_*))
      
      inline def setGpu(value: GpuInfo): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScreenSaver(value: Boolean): Self = StObject.set(x, "screenSaver", value.asInstanceOf[js.Any])
      
      inline def setScreenSaverUndefined: Self = StObject.set(x, "screenSaver", js.undefined)
    }
  }
  
  trait Time extends StObject {
    
    var idle: Double
    
    var irq: Double
    
    var nice: Double
    
    var sys: Double
    
    var user: Double
  }
  object Time {
    
    inline def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Time = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
      
      inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setSys(value: Double): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
