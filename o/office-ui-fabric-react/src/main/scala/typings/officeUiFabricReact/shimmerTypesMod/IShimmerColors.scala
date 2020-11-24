package typings.officeUiFabricReact.shimmerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerColors extends js.Object {
  
  /**
    * Defines the background color of the space in between and around shimmer elements (borders, gaps and
    * rounded corners).
    * @defaultvalue theme.palette.white
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * Defines the main background color which is the color you see when the wave is not animating.
    * @defaultvalue theme.palette.neutralLight
    */
  var shimmer: js.UndefOr[String] = js.native
  
  /**
    * Defines the tip color of the shimmer wave which gradually gets from and to `shimmer` color.
    * @defaultvalue theme.palette.neutralLighter
    */
  var shimmerWave: js.UndefOr[String] = js.native
}
object IShimmerColors {
  
  @scala.inline
  def apply(): IShimmerColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerColors]
  }
  
  @scala.inline
  implicit class IShimmerColorsOps[Self <: IShimmerColors] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setShimmer(value: String): Self = this.set("shimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmer: Self = this.set("shimmer", js.undefined)
    
    @scala.inline
    def setShimmerWave(value: String): Self = this.set("shimmerWave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmerWave: Self = this.set("shimmerWave", js.undefined)
  }
}
