package typings.officeUiFabricReact.shimmerLineTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerLineStyles extends js.Object {
  
  /**
    * Bottom-left corner SVG of the ShimmerLine component.
    */
  var bottomLeftCorner: js.UndefOr[IStyle] = js.native
  
  /**
    * Bottom-right corner SVG of the ShimmerLine component.
    */
  var bottomRightCorner: js.UndefOr[IStyle] = js.native
  
  /**
    * Root of the ShimmerLine component.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * Top-left corner SVG of the ShimmerLine component.
    */
  var topLeftCorner: js.UndefOr[IStyle] = js.native
  
  /**
    * Top-right corner SVG of the ShimmerLine component.
    */
  var topRightCorner: js.UndefOr[IStyle] = js.native
}
object IShimmerLineStyles {
  
  @scala.inline
  def apply(): IShimmerLineStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerLineStyles]
  }
  
  @scala.inline
  implicit class IShimmerLineStylesOps[Self <: IShimmerLineStyles] (val x: Self) extends AnyVal {
    
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
    def setBottomLeftCorner(value: IStyle): Self = this.set("bottomLeftCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLeftCorner: Self = this.set("bottomLeftCorner", js.undefined)
    
    @scala.inline
    def setBottomLeftCornerNull: Self = this.set("bottomLeftCorner", null)
    
    @scala.inline
    def setBottomRightCorner(value: IStyle): Self = this.set("bottomRightCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRightCorner: Self = this.set("bottomRightCorner", js.undefined)
    
    @scala.inline
    def setBottomRightCornerNull: Self = this.set("bottomRightCorner", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setTopLeftCorner(value: IStyle): Self = this.set("topLeftCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeftCorner: Self = this.set("topLeftCorner", js.undefined)
    
    @scala.inline
    def setTopLeftCornerNull: Self = this.set("topLeftCorner", null)
    
    @scala.inline
    def setTopRightCorner(value: IStyle): Self = this.set("topRightCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRightCorner: Self = this.set("topRightCorner", js.undefined)
    
    @scala.inline
    def setTopRightCornerNull: Self = this.set("topRightCorner", null)
  }
}
