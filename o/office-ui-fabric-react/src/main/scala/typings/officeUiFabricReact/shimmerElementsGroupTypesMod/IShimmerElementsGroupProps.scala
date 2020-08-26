package typings.officeUiFabricReact.shimmerElementsGroupTypesMod

import typings.officeUiFabricReact.shimmerTypesMod.IShimmerElement
import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerElementsGroupProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Defines the background color of the space in between and around shimmer elements.
    * @defaultvalue theme.palette.white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IShimmerElementsGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmerElementsGroup]] = js.native
  /**
    * Optional boolean for enabling flexWrap of the container containing the shimmerElements.
    * @defaultvalue false
    */
  var flexWrap: js.UndefOr[Boolean] = js.native
  /**
    * Optional maximum row height of the shimmerElements container.
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * Elements to render in one group of the Shimmer.
    */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]
  ] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Optional width for ShimmerElements container.
    */
  @JSName("width")
  var width_IShimmerElementsGroupProps: js.UndefOr[String] = js.native
}

object IShimmerElementsGroupProps {
  @scala.inline
  def apply(): IShimmerElementsGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerElementsGroupProps]
  }
  @scala.inline
  implicit class IShimmerElementsGroupPropsOps[Self <: IShimmerElementsGroupProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IShimmerElementsGroup | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IShimmerElementsGroup]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setFlexWrap(value: Boolean): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setShimmerElementsVarargs(value: IShimmerElement*): Self = this.set("shimmerElements", js.Array(value :_*))
    @scala.inline
    def setShimmerElements(value: js.Array[IShimmerElement]): Self = this.set("shimmerElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShimmerElements: Self = this.set("shimmerElements", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IShimmerElementsGroupStyleProps => DeepPartial[IShimmerElementsGroupStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

