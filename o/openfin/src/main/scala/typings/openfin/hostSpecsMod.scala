package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostSpecsMod {
  
  @js.native
  trait CpuInfo extends StObject {
    
    var model: String = js.native
    
    var speed: Double = js.native
    
    var times: Time = js.native
  }
  object CpuInfo {
    
    @scala.inline
    def apply(model: String, speed: Double, times: Time): CpuInfo = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    @scala.inline
    implicit class CpuInfoMutableBuilder[Self <: CpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes(value: Time): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GpuInfo extends StObject {
    
    var name: String = js.native
  }
  object GpuInfo {
    
    @scala.inline
    def apply(name: String): GpuInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GpuInfo]
    }
    
    @scala.inline
    implicit class GpuInfoMutableBuilder[Self <: GpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HostSpecs extends StObject {
    
    var aeroGlassEnabled: js.UndefOr[Boolean] = js.native
    
    var arch: String = js.native
    
    var cpus: js.Array[CpuInfo] = js.native
    
    var gpu: GpuInfo = js.native
    
    var memory: Double = js.native
    
    var name: String = js.native
    
    var screenSaver: js.UndefOr[Boolean] = js.native
  }
  object HostSpecs {
    
    @scala.inline
    def apply(arch: String, cpus: js.Array[CpuInfo], gpu: GpuInfo, memory: Double, name: String): HostSpecs = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostSpecs]
    }
    
    @scala.inline
    implicit class HostSpecsMutableBuilder[Self <: HostSpecs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAeroGlassEnabled(value: Boolean): Self = StObject.set(x, "aeroGlassEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAeroGlassEnabledUndefined: Self = StObject.set(x, "aeroGlassEnabled", js.undefined)
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpus(value: js.Array[CpuInfo]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpusVarargs(value: CpuInfo*): Self = StObject.set(x, "cpus", js.Array(value :_*))
      
      @scala.inline
      def setGpu(value: GpuInfo): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenSaver(value: Boolean): Self = StObject.set(x, "screenSaver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenSaverUndefined: Self = StObject.set(x, "screenSaver", js.undefined)
    }
  }
  
  @js.native
  trait Time extends StObject {
    
    var idle: Double = js.native
    
    var irq: Double = js.native
    
    var nice: Double = js.native
    
    var sys: Double = js.native
    
    var user: Double = js.native
  }
  object Time {
    
    @scala.inline
    def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Time = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    @scala.inline
    implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: Double): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
