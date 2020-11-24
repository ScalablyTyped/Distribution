package typings.popperjsCore.flipMod

import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowedAutoPlacementsVarargs(value: Placement*): Self = this.set("allowedAutoPlacements", js.Array(value :_*))
    
    @scala.inline
    def setAllowedAutoPlacements(value: js.Array[Placement]): Self = this.set("allowedAutoPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltAxis(value: Boolean): Self = this.set("altAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = this.set("altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = this.set("boundary", js.Array(value :_*))
    
    @scala.inline
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackPlacementsVarargs(value: Placement*): Self = this.set("fallbackPlacements", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPlacements(value: js.Array[Placement]): Self = this.set("fallbackPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipVariations(value: Boolean): Self = this.set("flipVariations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAxis(value: Boolean): Self = this.set("mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = this.set("rootBoundary", value.asInstanceOf[js.Any])
  }
}
