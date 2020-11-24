package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.preventOverflowMod.TetherOffset
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/preventOverflow.Options> */
@js.native
trait PartialOptionsAltAxis extends js.Object {
  
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
  implicit class PartialOptionsAltAxisOps[Self <: PartialOptionsAltAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltAxis(value: Boolean): Self = this.set("altAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltAxis: Self = this.set("altAxis", js.undefined)
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = this.set("altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltBoundary: Self = this.set("altBoundary", js.undefined)
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = this.set("boundary", js.Array(value :_*))
    
    @scala.inline
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setMainAxis(value: Boolean): Self = this.set("mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainAxis: Self = this.set("mainAxis", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = this.set("rootBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootBoundary: Self = this.set("rootBoundary", js.undefined)
    
    @scala.inline
    def setTether(value: Boolean): Self = this.set("tether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTether: Self = this.set("tether", js.undefined)
    
    @scala.inline
    def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double): Self = this.set("tetherOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTetherOffset(value: TetherOffset): Self = this.set("tetherOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTetherOffset: Self = this.set("tetherOffset", js.undefined)
  }
}
