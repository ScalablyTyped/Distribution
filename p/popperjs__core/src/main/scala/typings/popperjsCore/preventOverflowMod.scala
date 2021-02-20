package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.anon.Placement
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.popperjsCoreStrings.preventOverflow
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preventOverflowMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/preventOverflow", JSImport.Default)
  @js.native
  val default: Modifier[preventOverflow, Options] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var altAxis: Boolean = js.native
    
    var altBoundary: Boolean = js.native
    
    var boundary: Boundary = js.native
    
    var mainAxis: Boolean = js.native
    
    var padding: Padding = js.native
    
    var rootBoundary: RootBoundary = js.native
    
    /**
      * Allows the popper to overflow from its boundaries to keep it near its
      * reference element
      */
    var tether: Boolean = js.native
    
    var tetherOffset: TetherOffset = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      altAxis: Boolean,
      altBoundary: Boolean,
      boundary: Boundary,
      mainAxis: Boolean,
      padding: Padding,
      rootBoundary: RootBoundary,
      tether: Boolean,
      tetherOffset: TetherOffset
    ): Options = {
      val __obj = js.Dynamic.literal(altAxis = altAxis.asInstanceOf[js.Any], altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], tether = tether.asInstanceOf[js.Any], tetherOffset = tetherOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
      
      @scala.inline
      def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTether(value: Boolean): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTetherOffset(value: TetherOffset): Self = StObject.set(x, "tetherOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double): Self = StObject.set(x, "tetherOffset", js.Any.fromFunction1(value))
    }
  }
  
  type PreventOverflowModifier = Modifier[preventOverflow, Options]
  
  type TetherOffset = (js.Function1[/* arg0 */ Placement, Double]) | Double
  
  type _To = Modifier[preventOverflow, Options]
  
  /* This means you don't have to write `default`, but can instead just say `preventOverflowMod.foo` */
  override def _to: Modifier[preventOverflow, Options] = default
}
