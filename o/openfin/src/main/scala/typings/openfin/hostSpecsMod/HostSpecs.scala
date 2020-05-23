package typings.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostSpecs extends js.Object {
  var aeroGlassEnabled: js.UndefOr[Boolean] = js.undefined
  var arch: String
  var cpus: js.Array[CpuInfo]
  var gpu: GpuInfo
  var memory: Double
  var name: String
  var screenSaver: js.UndefOr[Boolean] = js.undefined
}

object HostSpecs {
  @scala.inline
  def apply(
    arch: String,
    cpus: js.Array[CpuInfo],
    gpu: GpuInfo,
    memory: Double,
    name: String,
    aeroGlassEnabled: js.UndefOr[Boolean] = js.undefined,
    screenSaver: js.UndefOr[Boolean] = js.undefined
  ): HostSpecs = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(aeroGlassEnabled)) __obj.updateDynamic("aeroGlassEnabled")(aeroGlassEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenSaver)) __obj.updateDynamic("screenSaver")(screenSaver.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostSpecs]
  }
}

