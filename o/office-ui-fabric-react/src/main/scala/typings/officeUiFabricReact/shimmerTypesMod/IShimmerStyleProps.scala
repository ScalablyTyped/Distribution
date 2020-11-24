package typings.officeUiFabricReact.shimmerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerStyleProps extends js.Object {
  
  /** Optional CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.native
  
  /** Boolean flag to trigger fadeIn/fadeOut transition animation when content is loaded. */
  var isDataLoaded: js.UndefOr[Boolean] = js.native
  
  /** Color to be used as the main background color of Shimmer when not animating. */
  var shimmerColor: js.UndefOr[String] = js.native
  
  /** Tip color of the shimmer wave which gradually gets from and to `shimmerColor`. */
  var shimmerWaveColor: js.UndefOr[String] = js.native
  
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
  
  /** Interval in milliseconds for the adeIn/fadeOut transition animation. */
  var transitionAnimationInterval: js.UndefOr[Double] = js.native
}
object IShimmerStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IShimmerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyleProps]
  }
  
  @scala.inline
  implicit class IShimmerStylePropsOps[Self <: IShimmerStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIsDataLoaded(value: Boolean): Self = this.set("isDataLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDataLoaded: Self = this.set("isDataLoaded", js.undefined)
    
    @scala.inline
    def setShimmerColor(value: String): Self = this.set("shimmerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmerColor: Self = this.set("shimmerColor", js.undefined)
    
    @scala.inline
    def setShimmerWaveColor(value: String): Self = this.set("shimmerWaveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmerWaveColor: Self = this.set("shimmerWaveColor", js.undefined)
    
    @scala.inline
    def setTransitionAnimationInterval(value: Double): Self = this.set("transitionAnimationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAnimationInterval: Self = this.set("transitionAnimationInterval", js.undefined)
  }
}
