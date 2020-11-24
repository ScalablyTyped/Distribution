package typings.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostSpecs extends js.Object {
  
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
  implicit class HostSpecsOps[Self <: HostSpecs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusVarargs(value: CpuInfo*): Self = this.set("cpus", js.Array(value :_*))
    
    @scala.inline
    def setCpus(value: js.Array[CpuInfo]): Self = this.set("cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpu(value: GpuInfo): Self = this.set("gpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAeroGlassEnabled(value: Boolean): Self = this.set("aeroGlassEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAeroGlassEnabled: Self = this.set("aeroGlassEnabled", js.undefined)
    
    @scala.inline
    def setScreenSaver(value: Boolean): Self = this.set("screenSaver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenSaver: Self = this.set("screenSaver", js.undefined)
  }
}
