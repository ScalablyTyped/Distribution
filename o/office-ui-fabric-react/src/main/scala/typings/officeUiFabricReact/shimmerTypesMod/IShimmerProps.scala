package typings.officeUiFabricReact.shimmerTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Localized string of the status label for screen reader
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IShimmer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmer]] = js.native
  /**
    * Custom elements when necessary to build complex placeholder skeletons.
    */
  var customElementsGroup: js.UndefOr[ReactNode] = js.native
  /**
    * Controls when the shimmer is swapped with actual data through an animated transition.
    * @defaultvalue false
    */
  var isDataLoaded: js.UndefOr[Boolean] = js.native
  /**
    * Defines an object with possible colors to pass for Shimmer customization used on different backgrounds.
    */
  var shimmerColors: js.UndefOr[IShimmerColors] = js.native
  /**
    * Elements to render in one line of the Shimmer.
    */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IShimmerProps {
  @scala.inline
  def apply(): IShimmerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerProps]
  }
  @scala.inline
  implicit class IShimmerPropsOps[Self <: IShimmerProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IShimmer | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IShimmer]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setCustomElementsGroup(value: ReactNode): Self = this.set("customElementsGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomElementsGroup: Self = this.set("customElementsGroup", js.undefined)
    @scala.inline
    def setIsDataLoaded(value: Boolean): Self = this.set("isDataLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataLoaded: Self = this.set("isDataLoaded", js.undefined)
    @scala.inline
    def setShimmerColors(value: IShimmerColors): Self = this.set("shimmerColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShimmerColors: Self = this.set("shimmerColors", js.undefined)
    @scala.inline
    def setShimmerElementsVarargs(value: IShimmerElement*): Self = this.set("shimmerElements", js.Array(value :_*))
    @scala.inline
    def setShimmerElements(value: js.Array[IShimmerElement]): Self = this.set("shimmerElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShimmerElements: Self = this.set("shimmerElements", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IShimmerStyleProps => DeepPartial[IShimmerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

