package typings.officeUiFabricReact.shimmerTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Localized string of the status label for screen reader
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IShimmer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmer]] = js.undefined
  /**
    * Custom elements when necessary to build complex placeholder skeletons.
    */
  var customElementsGroup: js.UndefOr[ReactNode] = js.undefined
  /**
    * Controls when the shimmer is swapped with actual data through an animated transition.
    * @defaultvalue false
    */
  var isDataLoaded: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines an object with possible colors to pass for Shimmer customization used on different backgrounds.
    */
  var shimmerColors: js.UndefOr[IShimmerColors] = js.undefined
  /**
    * Elements to render in one line of the Shimmer.
    */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IShimmerProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ariaLabel: String = null,
    componentRef: IRefObject[IShimmer] = null,
    customElementsGroup: ReactNode = null,
    isDataLoaded: js.UndefOr[Boolean] = js.undefined,
    shimmerColors: IShimmerColors = null,
    shimmerElements: js.Array[IShimmerElement] = null,
    styles: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles] = null,
    theme: ITheme = null
  ): IShimmerProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customElementsGroup != null) __obj.updateDynamic("customElementsGroup")(customElementsGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoaded)) __obj.updateDynamic("isDataLoaded")(isDataLoaded.get.asInstanceOf[js.Any])
    if (shimmerColors != null) __obj.updateDynamic("shimmerColors")(shimmerColors.asInstanceOf[js.Any])
    if (shimmerElements != null) __obj.updateDynamic("shimmerElements")(shimmerElements.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerProps]
  }
}

