package typings.officeUiFabricReact.shimmerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerStyles extends js.Object {
  /** Refers to wrapper element of the children only. */
  var dataWrapper: js.UndefOr[IStyle] = js.native
  /** Refers to the root wrapper element. */
  var root: js.UndefOr[IStyle] = js.native
  /** Styles for the hidden helper element to aid with screen readers. */
  var screenReaderText: js.UndefOr[IStyle] = js.native
  /** Refers to gradient element of the shimmer animation only. */
  var shimmerGradient: js.UndefOr[IStyle] = js.native
  /** Refers to wrapper element of the shimmer only. */
  var shimmerWrapper: js.UndefOr[IStyle] = js.native
}

object IShimmerStyles {
  @scala.inline
  def apply(): IShimmerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerStyles]
  }
  @scala.inline
  implicit class IShimmerStylesOps[Self <: IShimmerStyles] (val x: Self) extends AnyVal {
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
    def setDataWrapper(value: IStyle): Self = this.set("dataWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataWrapper: Self = this.set("dataWrapper", js.undefined)
    @scala.inline
    def setDataWrapperNull: Self = this.set("dataWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
    @scala.inline
    def setShimmerGradient(value: IStyle): Self = this.set("shimmerGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShimmerGradient: Self = this.set("shimmerGradient", js.undefined)
    @scala.inline
    def setShimmerGradientNull: Self = this.set("shimmerGradient", null)
    @scala.inline
    def setShimmerWrapper(value: IStyle): Self = this.set("shimmerWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShimmerWrapper: Self = this.set("shimmerWrapper", js.undefined)
    @scala.inline
    def setShimmerWrapperNull: Self = this.set("shimmerWrapper", null)
  }
  
}

