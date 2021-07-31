package typings.popperjsCore

import typings.popperjsCore.anon.PartialStateAttributes
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.ComputedPlacement
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeAutoPlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/computeAutoPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(state: PartialStateAttributes): js.Array[ComputedPlacement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComputedPlacement]]
  @scala.inline
  def default(state: PartialStateAttributes, options: Options): js.Array[ComputedPlacement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedPlacement]]
  
  trait Options extends StObject {
    
    var allowedAutoPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
    
    var boundary: Boundary
    
    var flipVariations: Boolean
    
    var padding: Padding
    
    var placement: Placement
    
    var rootBoundary: RootBoundary
  }
  object Options {
    
    @scala.inline
    def apply(
      boundary: Boundary,
      flipVariations: Boolean,
      padding: Padding,
      placement: Placement,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], flipVariations = flipVariations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedAutoPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
      
      @scala.inline
      def setAllowedAutoPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value :_*))
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
      
      @scala.inline
      def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
