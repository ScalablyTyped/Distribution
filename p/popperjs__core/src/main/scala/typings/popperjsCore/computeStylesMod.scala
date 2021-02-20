package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.anon.Adaptive
import typings.popperjsCore.anon.Bottom
import typings.popperjsCore.popperjsCoreStrings.computeStyles
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeStylesMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", JSImport.Default)
  @js.native
  val default: Modifier[computeStyles, Options] = js.native
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", "mapToStyles")
  @js.native
  def mapToStyles(hasPopperPopperRectPlacementOffsetsPositionGpuAccelerationAdaptive: Adaptive): Bottom = js.native
  
  type ComputeStylesModifier = Modifier[computeStyles, Options]
  
  @js.native
  trait Options extends StObject {
    
    var adaptive: Boolean = js.native
    
    var gpuAcceleration: Boolean = js.native
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
  
  type _To = Modifier[computeStyles, Options]
  
  /* This means you don't have to write `default`, but can instead just say `computeStylesMod.foo` */
  override def _to: Modifier[computeStyles, Options] = default
}
