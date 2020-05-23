package typings.officeUiFabricReact.shimmerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerStyles extends js.Object {
  /** Refers to wrapper element of the children only. */
  var dataWrapper: js.UndefOr[IStyle] = js.undefined
  /** Refers to the root wrapper element. */
  var root: js.UndefOr[IStyle] = js.undefined
  /** Styles for the hidden helper element to aid with screen readers. */
  var screenReaderText: js.UndefOr[IStyle] = js.undefined
  /** Refers to gradient element of the shimmer animation only. */
  var shimmerGradient: js.UndefOr[IStyle] = js.undefined
  /** Refers to wrapper element of the shimmer only. */
  var shimmerWrapper: js.UndefOr[IStyle] = js.undefined
}

object IShimmerStyles {
  @scala.inline
  def apply(
    dataWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderText: js.UndefOr[Null | IStyle] = js.undefined,
    shimmerGradient: js.UndefOr[Null | IStyle] = js.undefined,
    shimmerWrapper: js.UndefOr[Null | IStyle] = js.undefined
  ): IShimmerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataWrapper)) __obj.updateDynamic("dataWrapper")(dataWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderText)) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (!js.isUndefined(shimmerGradient)) __obj.updateDynamic("shimmerGradient")(shimmerGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(shimmerWrapper)) __obj.updateDynamic("shimmerWrapper")(shimmerWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyles]
  }
}

