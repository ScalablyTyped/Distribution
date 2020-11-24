package typings.popperjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/computeStyles.Options> */
@js.native
trait PartialOptionsAdaptive extends js.Object {
  
  var adaptive: js.UndefOr[Boolean] = js.native
  
  var gpuAcceleration: js.UndefOr[Boolean] = js.native
}
object PartialOptionsAdaptive {
  
  @scala.inline
  def apply(): PartialOptionsAdaptive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAdaptive]
  }
  
  @scala.inline
  implicit class PartialOptionsAdaptiveOps[Self <: PartialOptionsAdaptive] (val x: Self) extends AnyVal {
    
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
    def setAdaptive(value: Boolean): Self = this.set("adaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptive: Self = this.set("adaptive", js.undefined)
    
    @scala.inline
    def setGpuAcceleration(value: Boolean): Self = this.set("gpuAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuAcceleration: Self = this.set("gpuAcceleration", js.undefined)
  }
}
