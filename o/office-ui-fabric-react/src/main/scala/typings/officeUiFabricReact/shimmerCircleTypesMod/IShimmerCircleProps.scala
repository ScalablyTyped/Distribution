package typings.officeUiFabricReact.shimmerCircleTypesMod

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
trait IShimmerCircleProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Use to set custom styling of the shimmerCircle borders.
    * @deprecated Use `styles` prop to leverage mergeStyle API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.native
  /**
    * Optional callback to access the IShimmerCircle interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmerCircle]] = js.native
  /**
    * Sets the height of the circle.
    * @defaultvalue 24px
    */
  @JSName("height")
  var height_IShimmerCircleProps: js.UndefOr[Double] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IShimmerCircleProps {
  @scala.inline
  def apply(): IShimmerCircleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerCircleProps]
  }
  @scala.inline
  implicit class IShimmerCirclePropsOps[Self <: IShimmerCircleProps] (val x: Self) extends AnyVal {
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
    def setComponentRefFunction1(value: /* ref */ IShimmerCircle | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IShimmerCircle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IShimmerCircleStyleProps => DeepPartial[IShimmerCircleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

