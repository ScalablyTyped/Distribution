package typings.popperjsCore.preventOverflowMod

import typings.popperjsCore.anon.Placement
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
    def setAltAxis(value: Boolean): Self = this.set("altAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltBoundary(value: Boolean): Self = this.set("altBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryVarargs(value: HTMLElement*): Self = this.set("boundary", js.Array(value :_*))
    
    @scala.inline
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAxis(value: Boolean): Self = this.set("mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundary(value: RootBoundary): Self = this.set("rootBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTether(value: Boolean): Self = this.set("tether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double): Self = this.set("tetherOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTetherOffset(value: TetherOffset): Self = this.set("tetherOffset", value.asInstanceOf[js.Any])
  }
}
