package typings.popperjsCore

import typings.popperjsCore.anon.Adaptive
import typings.popperjsCore.anon.Bottom
import typings.popperjsCore.anon.Partialxnumberynumbercent
import typings.popperjsCore.popperjsCoreStrings.computeStyles
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.Offsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeStylesMod {
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@popperjs/core/lib/modifiers/computeStyles", JSImport.Default)
  @js.native
  val default: ComputeStylesModifier = js.native
  
  inline def mapToStyles(
    hasPopperPopperRectPlacementVariationOffsetsPositionGpuAccelerationAdaptiveRoundOffsetsIsFixed: Adaptive
  ): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToStyles")(hasPopperPopperRectPlacementVariationOffsetsPositionGpuAccelerationAdaptiveRoundOffsetsIsFixed.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  type ComputeStylesModifier = Modifier[computeStyles, Options]
  
  trait Options extends StObject {
    
    var adaptive: Boolean
    
    var gpuAcceleration: Boolean
    
    var roundOffsets: js.UndefOr[Boolean | RoundOffsets] = js.undefined
  }
  object Options {
    
    inline def apply(adaptive: Boolean, gpuAcceleration: Boolean): Options = {
      val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], gpuAcceleration = gpuAcceleration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
      
      inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
      
      inline def setRoundOffsets(value: Boolean | RoundOffsets): Self = StObject.set(x, "roundOffsets", value.asInstanceOf[js.Any])
      
      inline def setRoundOffsetsFunction1(value: /* offsets */ Partialxnumberynumbercent => Offsets): Self = StObject.set(x, "roundOffsets", js.Any.fromFunction1(value))
      
      inline def setRoundOffsetsUndefined: Self = StObject.set(x, "roundOffsets", js.undefined)
    }
  }
  
  type RoundOffsets = js.Function1[/* offsets */ Partialxnumberynumbercent, Offsets]
}
