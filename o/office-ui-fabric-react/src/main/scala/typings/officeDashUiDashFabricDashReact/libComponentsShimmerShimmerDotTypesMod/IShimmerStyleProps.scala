package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerStyleProps extends js.Object {
  /** Optional CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.undefined
  /** Boolean flag to trigger fadeIn/fadeOut transition animation when content is loaded. */
  var isDataLoaded: js.UndefOr[Boolean] = js.undefined
  /** Color to be used as the main background color of Shimmer when not animating. */
  var shimmerColor: js.UndefOr[String] = js.undefined
  /** Tip color of the shimmer wave which gradually gets from and to `shimmerColor`. */
  var shimmerWaveColor: js.UndefOr[String] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: ITheme
  /** Interval in milliseconds for the adeIn/fadeOut transition animation. */
  var transitionAnimationInterval: js.UndefOr[Double] = js.undefined
}

object IShimmerStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isDataLoaded: js.UndefOr[Boolean] = js.undefined,
    shimmerColor: String = null,
    shimmerWaveColor: String = null,
    transitionAnimationInterval: Int | Double = null
  ): IShimmerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isDataLoaded)) __obj.updateDynamic("isDataLoaded")(isDataLoaded)
    if (shimmerColor != null) __obj.updateDynamic("shimmerColor")(shimmerColor)
    if (shimmerWaveColor != null) __obj.updateDynamic("shimmerWaveColor")(shimmerWaveColor)
    if (transitionAnimationInterval != null) __obj.updateDynamic("transitionAnimationInterval")(transitionAnimationInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyleProps]
  }
}

