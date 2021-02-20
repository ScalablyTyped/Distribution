package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.popperjsCoreStrings.flip
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/flip", JSImport.Default)
  @js.native
  val default: Modifier[flip, Options] = js.native
  
  type FlipModifier = Modifier[flip, Options]
  
  @js.native
  trait Options extends StObject {
    
    var allowedAutoPlacements: js.Array[Placement] = js.native
    
    var altAxis: Boolean = js.native
    
    var altBoundary: Boolean = js.native
    
    var boundary: Boundary = js.native
    
    var fallbackPlacements: js.Array[Placement] = js.native
    
    var flipVariations: Boolean = js.native
    
    var mainAxis: Boolean = js.native
    
    var padding: Padding = js.native
    
    var rootBoundary: RootBoundary = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedAutoPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAutoPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value :_*))
      
      @scala.inline
      def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
      
      @scala.inline
      def setFallbackPlacements(value: js.Array[Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackPlacementsVarargs(value: Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value :_*))
      
      @scala.inline
      def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Modifier[flip, Options]
  
  /* This means you don't have to write `default`, but can instead just say `flipMod.foo` */
  override def _to: Modifier[flip, Options] = default
}
