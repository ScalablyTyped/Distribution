package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/computeStyles.Options> */
trait PartialOptionsAdaptive extends StObject {
  
  var adaptive: js.UndefOr[Boolean] = js.undefined
  
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
}
object PartialOptionsAdaptive {
  
  @scala.inline
  def apply(): PartialOptionsAdaptive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAdaptive]
  }
  
  @scala.inline
  implicit class PartialOptionsAdaptiveMutableBuilder[Self <: PartialOptionsAdaptive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveUndefined: Self = StObject.set(x, "adaptive", js.undefined)
    
    @scala.inline
    def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpuAccelerationUndefined: Self = StObject.set(x, "gpuAcceleration", js.undefined)
  }
}
