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
    dataWrapper: IStyle = null,
    root: IStyle = null,
    screenReaderText: IStyle = null,
    shimmerGradient: IStyle = null,
    shimmerWrapper: IStyle = null
  ): IShimmerStyles = {
    val __obj = js.Dynamic.literal()
    if (dataWrapper != null) __obj.updateDynamic("dataWrapper")(dataWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (shimmerGradient != null) __obj.updateDynamic("shimmerGradient")(shimmerGradient.asInstanceOf[js.Any])
    if (shimmerWrapper != null) __obj.updateDynamic("shimmerWrapper")(shimmerWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyles]
  }
}

