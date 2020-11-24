package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/flip.Options> */
@js.native
trait PartialOptionsAllowedAutoPlacements extends js.Object {
  
  var allowedAutoPlacements: js.UndefOr[js.Array[typings.popperjsCore.enumsMod.Placement]] = js.native
  
  var altAxis: js.UndefOr[Boolean] = js.native
  
  var altBoundary: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[Boundary] = js.native
  
  var fallbackPlacements: js.UndefOr[js.Array[typings.popperjsCore.enumsMod.Placement]] = js.native
  
  var flipVariations: js.UndefOr[Boolean] = js.native
  
  var mainAxis: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.native
}
object PartialOptionsAllowedAutoPlacements {
  
  @scala.inline
  def apply(): PartialOptionsAllowedAutoPlacements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAllowedAutoPlacements]
  }
  
  @scala.inline
  implicit class PartialOptionsAllowedAutoPlacementsOps[Self <: PartialOptionsAllowedAutoPlacements] (val x: Self) extends AnyVal {
    
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
    def setAllowedAutoPlacementsVarargs(value: typings.popperjsCore.enumsMod.Placement*): Self = this.set("allowedAutoPlacements", js.Array(value :_*))
    
    @scala.inline
    def setAllowedAutoPlacements(value: js.Array[typings.popperjsCore.enumsMod.Placement]): Self = this.set("allowedAutoPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAutoPlacements: Self = this.set("allowedAutoPlacements", js.undefined)
    
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
    def setFallbackPlacementsVarargs(value: typings.popperjsCore.enumsMod.Placement*): Self = this.set("fallbackPlacements", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPlacements(value: js.Array[typings.popperjsCore.enumsMod.Placement]): Self = this.set("fallbackPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackPlacements: Self = this.set("fallbackPlacements", js.undefined)
    
    @scala.inline
    def setFlipVariations(value: Boolean): Self = this.set("flipVariations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipVariations: Self = this.set("flipVariations", js.undefined)
    
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
  }
}
