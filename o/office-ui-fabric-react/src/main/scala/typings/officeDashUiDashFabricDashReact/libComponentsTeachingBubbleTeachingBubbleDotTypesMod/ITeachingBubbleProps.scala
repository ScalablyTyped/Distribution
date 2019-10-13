package typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.Target
import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleContentDotBaseMod.TeachingBubbleContentBase
import typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotBaseMod.TeachingBubbleBase
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleProps
  extends ClassAttributes[TeachingBubbleBase | TeachingBubbleContentBase]
     with IAccessiblePopupProps {
  /**
    * Defines the element id referencing the element containing the description for the TeachingBubble.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for TeachingBubble.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * Properties to pass through for Callout, reference detail properties in ICalloutProps
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Optional callback to access the ITeachingBubble interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITeachingBubble]] = js.undefined
  /**
    * Text that will be rendered in the footer of the TeachingBubble. May be rendered alongside primary and secondary buttons.
    */
  var footerContent: js.UndefOr[String | Element] = js.undefined
  /**
    * Does the TeachingBubble have a close button in the top right corner?
    */
  var hasCloseIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * A variation with smaller bold headline and no margins.
    */
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined
  /**
    * A variation with smaller bold headline and margins to the body (hasCondensedHeadline takes precedence if it is also set to true).
    */
  var hasSmallHeadline: js.UndefOr[Boolean] = js.undefined
  /**
    * A headline for the Teaching Bubble.
    */
  var headline: js.UndefOr[String] = js.undefined
  /**
    * An Image for the Teaching Bubble.
    */
  var illustrationImage: js.UndefOr[IImageProps] = js.undefined
  /**
    * Whether or not the Teaching Bubble is wide, with image on the left side.
    */
  var isWide: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback when the TeachingBubble tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * The Primary interaction button
    */
  var primaryButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * The Secondary interaction button
    */
  var secondaryButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]] = js.undefined
  /**
    * Element, MouseEvent, Point, or querySelector string that the TeachingBubble
    * should anchor to.
    */
  var target: js.UndefOr[Target] = js.undefined
  /**
    * @deprecated use target instead
    * Element to anchor the TeachingBubble to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ITeachingBubbleProps {
  @scala.inline
  def apply(
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    calloutProps: ICalloutProps = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[ITeachingBubble] = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    footerContent: String | Element = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseIcon: js.UndefOr[Boolean] = js.undefined,
    hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined,
    hasSmallHeadline: js.UndefOr[Boolean] = js.undefined,
    headline: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    illustrationImage: IImageProps = null,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isWide: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    primaryButtonProps: IButtonProps = null,
    ref: LegacyRef[TeachingBubbleBase | TeachingBubbleContentBase] = null,
    secondaryButtonProps: IButtonProps = null,
    styles: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles] = null,
    target: Target = null,
    targetElement: HTMLElement = null,
    theme: ITheme = null
  ): ITeachingBubbleProps = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss)
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap)
    if (!js.isUndefined(hasCloseIcon)) __obj.updateDynamic("hasCloseIcon")(hasCloseIcon)
    if (!js.isUndefined(hasCondensedHeadline)) __obj.updateDynamic("hasCondensedHeadline")(hasCondensedHeadline)
    if (!js.isUndefined(hasSmallHeadline)) __obj.updateDynamic("hasSmallHeadline")(hasSmallHeadline)
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing)
    if (illustrationImage != null) __obj.updateDynamic("illustrationImage")(illustrationImage)
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap)
    if (!js.isUndefined(isWide)) __obj.updateDynamic("isWide")(isWide)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (primaryButtonProps != null) __obj.updateDynamic("primaryButtonProps")(primaryButtonProps)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (secondaryButtonProps != null) __obj.updateDynamic("secondaryButtonProps")(secondaryButtonProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ITeachingBubbleProps]
  }
}

