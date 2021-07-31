package typings.popperjsCore

import typings.popperjsCore.anon.Adaptive
import typings.popperjsCore.anon.Bottom
import typings.popperjsCore.popperjsCoreStrings.computeStyles
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeStylesMod {
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", JSImport.Default)
  @js.native
  val default: Modifier[computeStyles, Options] = js.native
  
  @scala.inline
  def mapToStyles(hasPopperPopperRectPlacementOffsetsPositionGpuAccelerationAdaptive: Adaptive): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToStyles")(hasPopperPopperRectPlacementOffsetsPositionGpuAccelerationAdaptive.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  type ComputeStylesModifier = Modifier[computeStyles, Options]
  
  trait Options extends StObject {
    
    var adaptive: Boolean
    
    var gpuAcceleration: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(adaptive: Boolean, gpuAcceleration: Boolean): Options = {
      val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], gpuAcceleration = gpuAcceleration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
    }
  }
}
