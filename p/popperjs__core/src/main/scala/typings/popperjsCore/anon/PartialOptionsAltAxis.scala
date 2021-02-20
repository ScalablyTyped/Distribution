package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.preventOverflowMod.TetherOffset
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/preventOverflow.Options> */
@js.native
trait PartialOptionsAltAxis extends StObject {
  
  var altAxis: js.UndefOr[Boolean] = js.native
  
  var altBoundary: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[Boundary] = js.native
  
  var mainAxis: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.native
  
  var tether: js.UndefOr[Boolean] = js.native
  
  var tetherOffset: js.UndefOr[TetherOffset] = js.native
}
object PartialOptionsAltAxis {
  
  @scala.inline
  def apply(): PartialOptionsAltAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAltAxis]
  }
  
  @scala.inline
  implicit class PartialOptionsAltAxisMutableBuilder[Self <: PartialOptionsAltAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltAxisUndefined: Self = StObject.set(x, "altAxis", js.undefined)
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    @scala.inline
    def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = StObject.set(x, "boundary", js.Array(value :_*))
    
    @scala.inline
    def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    
    @scala.inline
    def setTether(value: Boolean): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetherOffset(value: TetherOffset): Self = StObject.set(x, "tetherOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double): Self = StObject.set(x, "tetherOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTetherOffsetUndefined: Self = StObject.set(x, "tetherOffset", js.undefined)
    
    @scala.inline
    def setTetherUndefined: Self = StObject.set(x, "tether", js.undefined)
  }
}
