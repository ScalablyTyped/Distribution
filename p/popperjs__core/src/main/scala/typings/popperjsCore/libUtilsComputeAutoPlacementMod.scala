package typings.popperjsCore

import typings.popperjsCore.anon.PartialStateAttributes
import typings.popperjsCore.libEnumsMod.Boundary
import typings.popperjsCore.libEnumsMod.ComputedPlacement
import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libEnumsMod.RootBoundary
import typings.popperjsCore.libTypesMod.Padding
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsComputeAutoPlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/computeAutoPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: PartialStateAttributes): js.Array[ComputedPlacement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComputedPlacement]]
  inline def default(state: PartialStateAttributes, options: Options): js.Array[ComputedPlacement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedPlacement]]
  
  trait Options extends StObject {
    
    var allowedAutoPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
    
    var boundary: Boundary
    
    var flipVariations: Boolean
    
    var padding: Padding
    
    var placement: Placement
    
    var rootBoundary: RootBoundary
  }
  object Options {
    
    inline def apply(
      boundary: Boundary,
      flipVariations: Boolean,
      padding: Padding,
      placement: Placement,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], flipVariations = flipVariations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowedAutoPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
      
      inline def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
      
      inline def setAllowedAutoPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value*))
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
