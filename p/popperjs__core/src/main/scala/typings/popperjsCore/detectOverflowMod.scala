package typings.popperjsCore

import typings.popperjsCore.anon.PartialOptions
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.Context
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.popperjsCore.typesMod.SideObject
import typings.popperjsCore.typesMod.State
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectOverflowMod {
  
  @JSImport("@popperjs/core/lib/utils/detectOverflow", JSImport.Default)
  @js.native
  def default(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib/utils/detectOverflow", JSImport.Default)
  @js.native
  def default(state: State, options: PartialOptions): SideObject = js.native
  
  @js.native
  trait Options extends StObject {
    
    var altBoundary: Boolean = js.native
    
    var boundary: Boundary = js.native
    
    var elementContext: Context = js.native
    
    var padding: Padding = js.native
    
    var placement: Placement = js.native
    
    var rootBoundary: RootBoundary = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      altBoundary: Boolean,
      boundary: Boundary,
      elementContext: Context,
      padding: Padding,
      placement: Placement,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], elementContext = elementContext.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
      
      @scala.inline
      def setElementContext(value: Context): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
