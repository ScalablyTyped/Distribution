package typings.officeUiFabricReact.shimmerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    transitionAnimationInterval: js.UndefOr[Double] = js.undefined
  ): IShimmerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoaded)) __obj.updateDynamic("isDataLoaded")(isDataLoaded.get.asInstanceOf[js.Any])
    if (shimmerColor != null) __obj.updateDynamic("shimmerColor")(shimmerColor.asInstanceOf[js.Any])
    if (shimmerWaveColor != null) __obj.updateDynamic("shimmerWaveColor")(shimmerWaveColor.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAnimationInterval)) __obj.updateDynamic("transitionAnimationInterval")(transitionAnimationInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyleProps]
  }
}

