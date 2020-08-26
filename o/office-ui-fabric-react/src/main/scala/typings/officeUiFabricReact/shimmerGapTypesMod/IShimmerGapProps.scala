package typings.officeUiFabricReact.shimmerGapTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerGapProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Use to set custom styling of the shimmerGap borders.
    * @deprecated Use `styles` prop to leverage mergeStyle API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.native
  /**
    * Optional callback to access the IShimmerGap interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmerGap]] = js.native
  /**
    * Sets the height of the gap.
    * @defaultvalue 16px
    */
  @JSName("height")
  var height_IShimmerGapProps: js.UndefOr[Double] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IShimmerGapProps {
  @scala.inline
  def apply(): IShimmerGapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerGapProps]
  }
  @scala.inline
  implicit class IShimmerGapPropsOps[Self <: IShimmerGapProps] (val x: Self) extends AnyVal {
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
    def setBorderStyle(value: IRawStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IShimmerGap | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IShimmerGap]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IShimmerGapStyleProps => DeepPartial[IShimmerGapStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

