package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.libEnumsMod.Boundary
import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libEnumsMod.RootBoundary
import typings.popperjsCore.libTypesMod.Modifier
import typings.popperjsCore.libTypesMod.Padding
import typings.popperjsCore.popperjsCoreStrings.flip
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModifiersFlipMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/flip", JSImport.Default)
  @js.native
  val default: FlipModifier = js.native
  
  type FlipModifier = Modifier[flip, Options]
  
  trait Options extends StObject {
    
    var allowedAutoPlacements: js.Array[Placement]
    
    var altAxis: Boolean
    
    var altBoundary: Boolean
    
    var boundary: Boundary
    
    var fallbackPlacements: js.Array[Placement]
    
    var flipVariations: Boolean
    
    var mainAxis: Boolean
    
    var padding: Padding
    
    var rootBoundary: RootBoundary
  }
  object Options {
    
    inline def apply(
      allowedAutoPlacements: js.Array[Placement],
      altAxis: Boolean,
      altBoundary: Boolean,
      boundary: Boundary,
      fallbackPlacements: js.Array[Placement],
      flipVariations: Boolean,
      mainAxis: Boolean,
      padding: Padding,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(allowedAutoPlacements = allowedAutoPlacements.asInstanceOf[js.Any], altAxis = altAxis.asInstanceOf[js.Any], altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], fallbackPlacements = fallbackPlacements.asInstanceOf[js.Any], flipVariations = flipVariations.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowedAutoPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
      
      inline def setAllowedAutoPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value*))
      
      inline def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setFallbackPlacements(value: js.Array[Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementsVarargs(value: Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
      
      inline def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FlipModifier
  
  /* This means you don't have to write `default`, but can instead just say `libModifiersFlipMod.foo` */
  override def _to: FlipModifier = default
}
